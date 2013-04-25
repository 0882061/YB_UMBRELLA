/**
 * Created By: YBASE
 * Created Date: 2013-4-19 上午11:42:57
 * Author: Tom Yang
 */
package com.ydev.domain;

/**
 * 物流信息
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class Logistics {
	
	/**
	 * 物流编号
	 */
	private String id;
	
	/**
	 * 省
	 */
	private String province;
	
	/**
	 * 市
	 */
	private String city;
	
	/**
	 * 县/区
	 */
	private String ca;
	
	/**
	 * 类型
	 * 1 EMS
	 * 2 顺风
	 * 3 普通
	 * 4 其他
	 */
	private Integer type;
	
	/**
	 * 物流单价(元/斤)
	 */
	private Float price;
	
	/**
	 * 备注
	 */
	private String memo;

	/* Constructor */
	public Logistics() {
		super();
	}

	/* Getter,Setter */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCa() {
		return ca;
	}

	public void setCa(String ca) {
		this.ca = ca;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
