/**
 * Created By: YBASE
 * Created Date: 2013-4-15 下午3:55:19
 * Author: Tom Yang
 */
package com.ydev.action.customer.product;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ydev.action.base.BaseAction;
import com.ydev.domain.Product;
import com.ydev.service.app.IProductManager;
import com.ydev.util.Page;
import com.ydev.util.PageUtil;
import com.ydev.util.StringUtil;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class ViewSpecial extends BaseAction {
	
	private static final Log logger = LogFactory.getLog(ViewSpecial.class);
	
	private IProductManager productManager;

	private String status;
	
	private String curPage;
	
	private String dispPg;
	
	private String dispRs;
	
	private String endPg;
	
	private String startPg;
	
	private Page page;
	
	private List<Product> specs;

	public String execute() {
		Integer tempStatus = 0;
		if(StringUtil.isNotNullOrEmpty(status)) {
			tempStatus = Integer.parseInt(status);
		}
		try {
			Integer count = productManager.countProductInSpecial(tempStatus);
			page = PageUtil.doPage(count, curPage, dispPg, dispRs, endPg, startPg);
			specs = productManager.getProductsInSpecialPage(page.getStart(), page.getDisplayRecord(), tempStatus);
		}catch(Exception e) {
			logger.error(e.getMessage(), e);
		}
		return SUCCESS;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurPage() {
		return curPage;
	}

	public void setCurPage(String curPage) {
		this.curPage = curPage;
	}

	public String getDispPg() {
		return dispPg;
	}

	public void setDispPg(String dispPg) {
		this.dispPg = dispPg;
	}

	public String getDispRs() {
		return dispRs;
	}

	public void setDispRs(String dispRs) {
		this.dispRs = dispRs;
	}

	public String getEndPg() {
		return endPg;
	}

	public void setEndPg(String endPg) {
		this.endPg = endPg;
	}

	public String getStartPg() {
		return startPg;
	}

	public void setStartPg(String startPg) {
		this.startPg = startPg;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public List<Product> getSpecs() {
		return specs;
	}

	public void setSpecs(List<Product> specs) {
		this.specs = specs;
	}

	public void setProductManager(IProductManager productManager) {
		this.productManager = productManager;
	}
	
}
