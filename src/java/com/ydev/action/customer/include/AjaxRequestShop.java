package com.ydev.action.customer.include;

import com.ydev.action.base.BaseAction;
import com.ydev.domain.Shop;
import com.ydev.service.app.IShopManager;
import com.ydev.util.ClobUtil;

public class AjaxRequestShop extends BaseAction {

	private IShopManager shopManager;
	
	private Shop shop;
	
	private String introduce;
	
	public String execResult(){
		shop = shopManager.getShop();
		introduce = ClobUtil.clobToString(shop.getIntroduce());
		return SUCCESS;
	}
	
	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public void setShopManager(IShopManager shopManager) {
		this.shopManager = shopManager;
	}
	
}
