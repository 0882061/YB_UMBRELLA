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

/**
 * @author Tom Yang
 * @version 1.0
 */
public class ViewProduct extends BaseAction {
	
	private static final Log logger = LogFactory.getLog(ViewProduct.class);
	
	private IProductManager productManager;

	private String status;
	
	private String curPage;
	
	private String dispPg;
	
	private String dispRs;
	
	private String endPg;
	
	private String startPg;
	
	private Page page;
	
	private List<Product>  pros;

	public String execute() {
		Integer statusTemp = null;
		if (null != status && !"".equals(status)) {
			try {
				statusTemp = Integer.parseInt(status);
			} catch (NumberFormatException e) {
				logger.error(e.getMessage(), e);
			}
		}
		
		Integer recordTotal = productManager.countProduct(statusTemp);
		page = PageUtil.doPage(recordTotal, curPage, dispPg, dispRs, endPg,
				startPg);
		pros = productManager.getProductsPage(statusTemp, page.getStart(), page.getDisplayRecord());
		return SUCCESS;
	}

	private void doPage(Integer statusTemp) {
		
	}

	public void setProductManager(IProductManager productManager) {
		this.productManager = productManager;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public List<Product> getPros() {
		return pros;
	}

	public void setPros(List<Product> pros) {
		this.pros = pros;
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
	
}
