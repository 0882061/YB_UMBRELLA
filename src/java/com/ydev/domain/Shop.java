/**
 * Created By: YBASE
 * Created Date: 2013-4-19 上午9:16:47
 * Author: Tom Yang
 */
package com.ydev.domain;

import java.sql.Clob;
/**
 * 商店信息
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class Shop {
	
	/**
	 * 商店名称 (主键)
	 */
	private String name;
	
	/**
	 * 商店地址
	 */
	private String address;
	
	/**
	 * 商店介绍
	 */
	private Clob introduce;
	
	/**
	 * 商店备注
	 */
	private String memo;
	
	/* Constructor */
	public Shop() {
		super();
	}

	/* Getter,Setter */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Clob getIntroduce() {
		return introduce;
	}

	public void setIntroduce(Clob introduce) {
		this.introduce = introduce;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
