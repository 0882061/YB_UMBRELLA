/**
 * Created By: Comwave Project Team
 * Created Date: 2012-12-6 下午3:10:39
 */
package com.ydev.service.sample;

import java.util.List;

import com.ydev.domain.User;

/**
 * @author Tom Yang
 * @version 1.0
 */
public interface IUserManager {

	/**
	 * 根据userId 查询Y_USER表
	 * 
	 * @param userId
	 * @return User 用户对象
	 */
	public User queryUser(Integer userId);

	/**
	 * 保存user
	 * 
	 * @param user
	 *            用户对象
	 */
	public void addUser(User user);

	/**
	 * Query all user tables records
	 * 
	 * @return User list
	 */
	public List<User> getUsers();
	
	/**
	 * 调用存储过程，查询Y_USER所有记录
	 * @param queryStr Query condition
	 * @return {@link User}列表
	 */
	public List<User> callQueryUserPR(final String queryStr);
 
	/**
	 * 更新userId -> userName {@link User}記錄
	 * @param userId 用戶編號
	 * @param newName 新用戶名
	 * @throw when userId is null
	 */
	public void saveOrUpdateUser(Integer userId,String newName)throws Exception;
}
