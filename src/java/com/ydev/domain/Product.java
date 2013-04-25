/**
 * Created By: YBASE
 * Created Date: 2013-4-19 上午9:22:45
 * Author: Tom Yang
 */
package com.ydev.domain;

import java.util.List;

/**
 * 商品信息
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class Product {
	
	
	/**
	 * 商品编号(主键)
	 */
	private String id;
	
	/**
	 * 商品类型
	 */
	private String type;
	
	/**
	 * 商品售价
	 */
	private Float salePrice;
	
	/**
	 * 促销打折 
	 * 1.以%结尾  打折
	 * 2.数值字符串  特价促销
	 * 3.null 不打折 、不促销
	 */
	private String promo;
	
	/**
	 * 新品、特色标记
	 * 1  特色
	 * 2 新品
	 * 0 普通 
	 */
	private Integer fenew;
	
	
	/**
	 * 商品图片路径 
	 */
	private String picPath;
	
	/**
	 * 商品状态
	 * 0 新创建
	 * 1 上架
	 * 2 断货
	 * 3 下架
	 * 4 无效
	 */
	private Integer status;
	
	/**
	 * 商品详情
	 */
	private String desc;
	
	/**
	 * 备注
	 */
	private String memo;
	
	/**
	 * 商品颜色集合
	 */
	private List<ProductColor> prcors;
	
	/**
	 * 购置清单
	 */
	private List<Purchase> purcs;

	/* Constructor */
	public Product() {
		super();
	}
	
	/* Getter,Setter */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Float salePrice) {
		this.salePrice = salePrice;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public Integer getFenew() {
		return fenew;
	}

	public void setFenew(Integer fenew) {
		this.fenew = fenew;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<ProductColor> getPrcors() {
		return prcors;
	}

	public void setPrcors(List<ProductColor> prcors) {
		this.prcors = prcors;
	}

	public List<Purchase> getPurcs() {
		return purcs;
	}

	public void setPurcs(List<Purchase> purcs) {
		this.purcs = purcs;
	}
	
}
