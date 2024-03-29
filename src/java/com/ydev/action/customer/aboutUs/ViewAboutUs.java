/**
 * Created By: YBASE
 * Created Date: 2013-4-3 下午5:17:17
 * Author: Tom Yang
 */
package com.ydev.action.customer.aboutUs;

import com.opensymphony.xwork2.ActionSupport;
import com.ydev.domain.Shop;
import com.ydev.service.app.IShopManager;
import com.ydev.util.ClobUtil;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class ViewAboutUs extends ActionSupport{
	

	private IShopManager shopManager;
	
	private Shop shop;
	
	private String introduce;
	
	public String execute(){
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
