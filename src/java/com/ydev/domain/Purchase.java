/**
 * Created By: YBASE
 * Created Date: 2013-4-19 上午11:48:51
 * Author: Tom Yang
 */
package com.ydev.domain;

import java.util.Date;

/**
 * 商品购置信息
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class Purchase {
	
	/**
	 * 购置编号
	 */
	private String id;
	
	/**
	 * 购置日期
	 */
	private Date puDate;
	
	/**
	 * 商品产地
	 */
	private String orginal;
	
	/**
	 * 产商
	 */
	private String merchant;
	
	/**
	 * 购置数量
	 */
	private Integer puNum;
	
	/**
	 * 备注
	 */
	private String memo;
	
	/**
	 * 颜色详细
	 */
	private UMColor umColor;
	
	/**
	 * 商品信息
	 */
	private Product pdt;
	
	/* Constructor */
	public Purchase() {
		super();
	}

	/* Getter,Setter */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getPuDate() {
		return puDate;
	}

	public void setPuDate(Date puDate) {
		this.puDate = puDate;
	}

	public String getOrginal() {
		return orginal;
	}

	public void setOrginal(String orginal) {
		this.orginal = orginal;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public Integer getPuNum() {
		return puNum;
	}

	public void setPuNum(Integer puNum) {
		this.puNum = puNum;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public UMColor getUmColor() {
		return umColor;
	}

	public void setUmColor(UMColor umColor) {
		this.umColor = umColor;
	}

	public Product getPdt() {
		return pdt;
	}

	public void setPdt(Product pdt) {
		this.pdt = pdt;
	}
	
}
