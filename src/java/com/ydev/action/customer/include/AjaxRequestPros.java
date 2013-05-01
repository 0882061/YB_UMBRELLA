package com.ydev.action.customer.include;

import java.util.List;

import com.ydev.action.base.BaseAction;
import com.ydev.constant.UM_Constant;
import com.ydev.domain.Product;
import com.ydev.service.app.IProductManager;

public class AjaxRequestPros extends BaseAction {

	private List<Product> pros;
	
	private IProductManager productManager;
	
	public String listPromos(){
		pros = productManager.getProductsInPromo(UM_Constant.PROMO_YES,UM_Constant.STATUS_ONLINE);
		return SUCCESS;
	}

	
	public List<Product> getPros() {
		return pros;
	}

	public void setPros(List<Product> pros) {
		this.pros = pros;
	}

	public void setProductManager(IProductManager productManager) {
		this.productManager = productManager;
	}
	
}
