/**
 * Created By: YBASE
 * Created Date: 2013-4-19 上午11:29:17
 * Author: Tom Yang
 */
package com.ydev.domain;

import java.util.Date;

import com.mysql.jdbc.Clob;

/**
 * 留言信息
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class LeaveMsg {
	
	/**
	 * 留言编号 
	 */
	private String id;
	
	/**
	 * 留言日期
	 */
	private Date lmDate;
	
	/**
	 * 内容
	 */
	private Clob content;
	
	/**
	 * 留言人
	 */
	private String from;
	
	/**
	 * 主题
	 */
	private String topic;
	
	/**
	 * 状态
	 * 0 新留言
	 * 1 未回复
	 * 2 已回复
	 * 3 发件箱
	 * 4 失效
	 */
	private Integer status;
	
	
	/**
	 * 备注 
	 */
	private String memo;


	/* Constructor */
	public LeaveMsg() {
		super();
	}

	/* Getter,Setter */
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Date getLmDate() {
		return lmDate;
	}


	public void setLmDate(Date lmDate) {
		this.lmDate = lmDate;
	}


	public Clob getContent() {
		return content;
	}


	public void setContent(Clob content) {
		this.content = content;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
