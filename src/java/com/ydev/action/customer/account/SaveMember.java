/**
 * Created By: YBASE
 * Created Date: 2013-4-29 下午4:40:03
 * Author: Tom Yang
 */
package com.ydev.action.customer.account;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ydev.action.base.BaseAction;
import com.ydev.constant.UM_Constant;
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
	
	private String alertStatus;
	
	public String execute() {
		
		if(null!=mem&&StringUtil.isNotNullOrEmpty(mem.getId())) {
			String checkRs = memberManager.isUniqueMemberID(mem.getId());
			if(UM_Constant.MEM_ID_NOTUNI.equals(checkRs)){
				addActionError("\u7528\u6237\u540d\u4e0d\u552f\u4e00");
				alertStatus = ERROR;
				return alertStatus;
			}
		}else {
			addActionError("\u586b\u5199\u4fe1\u606f\u9519\u8bef");
			alertStatus = ERROR;
			return alertStatus;
		}
		
		memberManager.SaveOrUpdateMember(mem);
		alertStatus = SUCCESS;
		return alertStatus;
	}

	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}
	
	public String getAlertStatus() {
		return alertStatus;
	}

	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
	}

	public void setMemberManager(IMemberManager memberManager) {
		this.memberManager = memberManager;
	}
}
