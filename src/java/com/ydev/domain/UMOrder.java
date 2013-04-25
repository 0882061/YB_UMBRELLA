/**
 * Created By: YBASE
 * Created Date: 2013-4-19 上午11:48:51
 * Author: Tom Yang
 */
package com.ydev.domain;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * 订单信息
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class UMOrder {
	
	/**
	 * 订单编号 
	 */
	private String id;
	
	/**
	 * 收件人
	 */
	private String consignee;
	
	/**
	 * 下单日期
	 */
	private Date ordDate;
	
	/**
	 * 送货地址
	 */
	private String address;
	
	/**
	 * 邮编
	 */
	private String postNo;
	
	/**
	 * 订单金额
	 */
	private Float aom;
	
	/**
	 * 运费
	 */
	private Float freight;
	
	/**
	 * 联系电话
	 */
	private String phoneNo;
	
	/**
	 * 淘宝账号
	 */
	private String tAccout;
	
	/**
	 * 订单状态
	 * 0 有效
	 * 1 失效
	 */
	private Integer ordStatus;
	
	/**
	 * 付款状态
	 * 0 未付款
	 * 1 已付款
	 * 2 退款
	 * 3 到账
	 * 4 为退款
	 * 5 其他
	 */
	private Integer payStatus;
	
	/**
	 * 发货状态
	 * 0 未发货
	 * 1 已发货
	 * 2 确认收货
	 */
	private Integer sendStatus;
	
	/**
	 * 备注
	 */
	private String memo;
	
	/**
	 * 订单商品集合
	 */
	private List<OrderProduct> orpts;
	
	/**
	 * 会员信息
	 */
	private Member umMem;
	
	/* Constructor */
	public UMOrder() {
		super();
	}

	/* Getter,Setter */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostNo() {
		return postNo;
	}

	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}

	public Float getAom() {
		return aom;
	}

	public void setAom(Float aom) {
		this.aom = aom;
	}

	public Float getFreight() {
		return freight;
	}

	public void setFreight(Float freight) {
		this.freight = freight;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String gettAccout() {
		return tAccout;
	}

	public void settAccout(String tAccout) {
		this.tAccout = tAccout;
	}

	public Integer getOrdStatus() {
		return ordStatus;
	}

	public void setOrdStatus(Integer ordStatus) {
		this.ordStatus = ordStatus;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public Integer getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(Integer sendStatus) {
		this.sendStatus = sendStatus;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<OrderProduct> getOrpts() {
		return orpts;
	}

	public void setOrpts(List<OrderProduct> orpts) {
		this.orpts = orpts;
	}

	public Member getUmMem() {
		return umMem;
	}

	public void setUmMem(Member umMem) {
		this.umMem = umMem;
	}
	
}
