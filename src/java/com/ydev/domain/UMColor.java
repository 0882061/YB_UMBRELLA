/**
 * Created By: YBASE
 * Created Date: 2013-4-19 上午11:25:19
 * Author: Tom Yang
 */
package com.ydev.domain;

/**
 * 颜色信息
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class UMColor {
	
	/**
	 * 颜色编号
	 */
	private String id;
	
	/**
	 * 颜色名称
	 */
	private String name;
	
	/**
	 * 颜色图片路径
	 */
	private String picPath;
	
	/**
	 * 备注
	 */
	private String memo;

	/* Constructor */
	public UMColor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* Getter,Setter */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
