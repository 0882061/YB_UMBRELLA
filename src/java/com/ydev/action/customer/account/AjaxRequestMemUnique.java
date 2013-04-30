/**
 * Created By: YBASE
 * Created Date: 2013-4-29 下午5:26:58
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
public class AjaxRequestMemUnique extends BaseAction {

	private static final Log logger = LogFactory.getLog(AjaxRequestMemUnique.class);
	
	private IMemberManager memberManager;
	
	private Member mem;
	
	private String result;
	
	public String execMemUnique() {
		if(StringUtil.isNullOrEmpty(mem.getId())) {
			result = UM_Constant.MEM_ID_NULL;
			return SUCCESS;
		}
		
		result = memberManager.isUniqueMemberID(mem.getId());
		return SUCCESS;
	}

	
	public Member getMem() {
		return mem;
	}


	public void setMem(Member mem) {
		this.mem = mem;
	}


	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setMemberManager(IMemberManager memberManager) {
		this.memberManager = memberManager;
	}

}
