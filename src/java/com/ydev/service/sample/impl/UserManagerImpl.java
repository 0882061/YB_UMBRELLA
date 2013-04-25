/**
 * Created By: Comwave Project Team
 * Created Date: 2012-12-6 下午4:43:54
 */
package com.ydev.service.sample.impl;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ydev.domain.User;
import com.ydev.service.sample.IUserManager;
import com.ydev.util.ResultUtil;

/**
 * @author Tom Yang
 * @version 1.0
 */
@SuppressWarnings("unchecked")
public class UserManagerImpl extends HibernateDaoSupport implements IUserManager {
	private static Log logger = LogFactory.getLog(UserManagerImpl.class);

	/**
	 * 根据userId 查询Y_USER表
	 * 
	 * @param userId
	 * @return User 用户对象
	 */
	public User queryUser(Integer userId) {
		User user = null;
		List<Object> params = new ArrayList<Object>();
		if (userId != null) {
			params.add(userId);
			user = (User) ResultUtil.firstResult(getHibernateTemplate().find("from User where id=?", params.toArray()));
			logger.debug("query user,condition(userid:" + userId + "):" + user);
		}
		return user;
	}

	/**
	 * 保存user
	 * 
	 * @param user
	 *            用户对象
	 */
	public void addUser(User user) {
		if (user != null) {
			getHibernateTemplate().saveOrUpdate(user);
			logger.debug("saveOrUpdate user,id(" + user.getId() + "):");
		}
	}

	/**
	 * 调用存储过程，查询Y_USER所有记录
	 * @param queryStr Query condition
	 * @return {@link User}列表
	 */
	@SuppressWarnings({"rawtypes","deprecation"})
	public List<User> callQueryUserPR(final String queryStr) {
		final List<User> userList = new ArrayList<User>();
		getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				String callSQL = "{call QUERYUSER(?,?)}";
				CallableStatement callstmt = session.connection().prepareCall(callSQL);
				callstmt.setString(1, queryStr);
				callstmt.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
				callstmt.execute();
				ResultSet rs = (ResultSet)callstmt.getObject(2);
				
				if(rs!=null) {
					User user = new User();
					while(rs.next()) {
						user.setId(rs.getInt("USER_ID"));
						user.setName(rs.getString("USER_NAME"));
						user.setSex(rs.getInt("USER_SEX"));
						user.setSysUser(rs.getBoolean("SYS_USER"));
						userList.add(user);
					}
				}
				return null;
			}
		});
		return userList;
	}

	/**
	 * Query all user tables records
	 * 
	 * @return User list
	 */
	public List<User> getUsers() {
		return (List<User>) getHibernateTemplate().find("from User");
	}
	
	/**
	 * 更新userId -> userName {@link User}記錄
	 * @param userId 用戶編號
	 * @param newName 新用戶名
	 * @throw Exception when userId is null
	 */
	public void saveOrUpdateUser(final Integer userId,final String newName)throws Exception{
		final String hql = "update User set name = ? where id = ?";
		ArrayList<Object> params = new ArrayList<Object>();
		if(userId == null) {
			throw new Exception("userId is null");
		}
		params.add(userId);
		params.add(newName);
		getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				query.setString(0, newName);
				query.setInteger(1, Integer.valueOf(userId));
				query.executeUpdate();
				return null;
			}
		});
	}
}
