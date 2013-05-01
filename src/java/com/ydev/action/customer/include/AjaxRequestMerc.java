package com.ydev.action.customer.include;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ydev.action.base.BaseAction;
import com.ydev.service.app.IPurchaseManager;

public class AjaxRequestMerc extends BaseAction {

	private IPurchaseManager purchaseManager;
	
	private Set<String> mers;
	
	public String execResult(){
		List<String> mersList = purchaseManager.getMerchants();
		mers = new HashSet<String>(mersList);
		return SUCCESS;
	}

	public Set<String> getMers() {
		return mers;
	}

	public void setMers(Set<String> mers) {
		this.mers = mers;
	}

	public void setPurchaseManager(IPurchaseManager purchaseManager) {
		this.purchaseManager = purchaseManager;
	}
	
}
