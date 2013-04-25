/**
 * Created By: YBASE
 * Created Date: 2013-4-19 下午12:06:57
 * Author: Tom Yang
 */
package com.ydev.domain;

/**
 * 订单商品信息
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class OrderProduct {
	
	/**
	 * 序号(主键)
	 */
	private String id;
	
	/**
	 * 订单编号
	 */
	private String oId;
	
	/**
	 * 订购数量
	 */
	private Integer oNum;
	
	/**
	 * 备注
	 */
	private String memo;
	
	/**
	 * 商品颜色
	 */
	private UMColor umColor;
	
	/**
	 * 商品信息
	 */
	private Product pdt;

	/* Constructor */
	public OrderProduct() {
		super();
	}

	/* Getter,Setter */
	public String getoId() {
		return oId;
	}

	public void setoId(String oId) {
		this.oId = oId;
	}

	public Integer getoNum() {
		return oNum;
	}

	public void setoNum(Integer oNum) {
		this.oNum = oNum;
	}

	public String getMemo() {
		return memo;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
