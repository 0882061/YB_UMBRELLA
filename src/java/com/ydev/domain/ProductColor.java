/**
 * Created By: YBASE
 * Created Date: 2013-4-19 上午9:44:32
 * Author: Tom Yang
 */
package com.ydev.domain;

/**
 * 商品颜色信息
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class ProductColor {
	
	/**
	 * 序號(主鍵) 
	 */
	private String pcId;
	
	/**
	 * 该类颜色库存
	 */
	private Integer num;
	
	/**
	 * 该类颜色图片路径
	 */
	private String picPath;
	
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
	public ProductColor() {
		super();
	}

	/* Getter,Setter */
	
	public Integer getNum() {
		return num;
	}

	public String getPcId() {
		return pcId;
	}

	public void setPcId(String pcId) {
		this.pcId = pcId;
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

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
