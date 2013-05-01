package com.ydev.util;

import java.util.List;

public class Page {

	public static final int PAGE_START = 1;

	private int start = PAGE_START;  //当前查询开始记录序号   请求参数
	
	private int recordTotal;   //总记录条数     返回参数
	
	private int pageTotal;   //总页数   返回参数
	
	private int currentPage;  //当前页数    请求参数
	
 	private int displayRecord; //每页显示条数   请求参数
	
	private int displayPage;   //每次显示的页面数量   请求参数
	
	private int startPage=PAGE_START; //每次显示最前一页数 返回参数
	
	private int endPage; //当前显示最后一页数   返回参数
	
	private int lastStartPage;
	
	private List<Integer> dis;
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}

	public int getRecordTotal() {
		return recordTotal;
	}

	public void setRecordTotal(int recordTotal) {
		this.recordTotal = recordTotal;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getDisplayRecord() {
		return displayRecord;
	}

	public void setDisplayRecord(int displayRecord) {
		this.displayRecord = displayRecord;
	}

	public int getDisplayPage() {
		return displayPage;
	}

	public void setDisplayPage(int displayPage) {
		this.displayPage = displayPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public List<Integer> getDis() {
		return dis;
	}

	public void setDis(List<Integer> dis) {
		this.dis = dis;
	}

	public int getLastStartPage() {
		return lastStartPage;
	}

	public void setLastStartPage(int lastStartPage) {
		this.lastStartPage = lastStartPage;
	}
	
}
