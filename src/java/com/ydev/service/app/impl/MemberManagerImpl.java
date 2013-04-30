/**
 * Created By: YBASE
 * Created Date: 2013-4-29 下午4:46:50
 * Author: Tom Yang
 */
package com.ydev.service.app.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ydev.constant.UM_Constant;
import com.ydev.domain.Member;
import com.ydev.domain.Product;
import com.ydev.service.app.IMemberManager;
import com.ydev.util.StringUtil;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class MemberManagerImpl extends HibernateDaoSupport implements IMemberManager {

	public Member getMember() {
		return null;
	}

	public void SaveOrUpdateMember(Member mem) {
		getHibernateTemplate().saveOrUpdate(mem);
	}

	public String isUniqueMemberID(String memID) {
		if(StringUtil.isNotNullOrEmpty(memID)) {
			Member mem = getHibernateTemplate().get(Member.class, memID);
			return mem==null?UM_Constant.MEM_ID_UNI:UM_Constant.MEM_ID_NOTUNI;
		}else {
			return UM_Constant.MEM_ID_NULL;
		}
	}

	

}
