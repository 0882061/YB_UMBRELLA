/**
 * Created By: YBASE
 * Created Date: 2013-4-19 上午8:59:54
 * Author: Tom Yang
 */
package com.ydev.domain;

import java.util.List;
import java.util.Set;

/**
 * 会员信息
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class Member {
	
	
	/**
	 * 会员编号(主键)
	 */
	private String id;
	
	
	/**
	 * 会员密码
	 */
	private String password;
	
	
	/**
	 * 联系电话 
	 */
	private String telephone;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 电子邮箱
	 */
	private String email;
	
	/**
	 * 淘宝账号
	 */
	private String tAccout;
	
	/**
	 * 积分
	 */
	private Integer integral;
	
	/**
	 * 状态(0:异常    1:正常)
	 */
	private String status;
	
	/**
	 * 订单集合
	 */
	private List<UMOrder> orders;

	/* Constructor */
	public Member() {
		super();
	}
	
	/*  Getter,Setter  */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String gettAccout() {
		return tAccout;
	}

	public void settAccout(String tAccout) {
		this.tAccout = tAccout;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<UMOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<UMOrder> orders) {
		this.orders = orders;
	}

}
