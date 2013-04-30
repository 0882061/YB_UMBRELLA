/**
 * Created By: YBASE
 * Created Date: 2013-4-29 下午4:40:03
 * Author: Tom Yang
 */
package com.ydev.action.customer.account;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ydev.action.base.BaseAction;
import com.ydev.domain.Member;
import com.ydev.service.app.IMemberManager;
import com.ydev.util.StringUtil;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class SaveMember extends BaseAction {
	
	private static final Log logger = LogFactory.getLog(SaveMember.class);

	private IMemberManager memberManager;
	
	private Member mem;
	
	public String execute() {
		
		if(null!=mem&&StringUtil.isNotNullOrEmpty(mem.getId())) {
			memberManager.isUniqueMemberID(mem.getId());
		}else {
			addActionError("\u586b\u5199\u4fe1\u606f\u9519\u8bef");
			return ERROR;
		}
		
		memberManager.SaveOrUpdateMember(mem);
		return SUCCESS;
	}

	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}

	public void setMemberManager(IMemberManager memberManager) {
		this.memberManager = memberManager;
	}
}
