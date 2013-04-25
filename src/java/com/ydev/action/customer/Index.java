/**
 * Created By: Comwave Project Team
 * Created Date: 2012-12-7 上午9:10:21
 */
package com.ydev.action.customer;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ydev.constant.UM_Constant;
import com.ydev.domain.Product;
import com.ydev.service.app.IProductManager;

/**
 * @author Tom  Yang
 * @version 1.0
 */
@SuppressWarnings("serial")
public class Index extends ActionSupport {
	
	private IProductManager productManager;
	
	private List<Product> fenewPros;
	
	public String execute() {
		fenewPros = productManager.getProductsByFeNew(UM_Constant.FETURE_Y);
		return SUCCESS;
	}

	public List<Product> getFenewPros() {
		if(fenewPros==null||fenewPros.size()<=0){
			fenewPros = new ArrayList<Product>();
		}
		return fenewPros;
	}

	public void setFenewPros(List<Product> fenewPros) {
		this.fenewPros = fenewPros;
	}

	public void setProductManager(IProductManager productManager) {
		this.productManager = productManager;
	}
	
}
