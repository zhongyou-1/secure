package com.qidian.comm;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @title 
 * @author Xrt rong tao
 * @version 1.0.0
 * @since jdk1.8
 * @创建时间：2018年11月25日下午9:01:01
 * @功能描述：
 */
public class Page {
	
	private int totalRows;
	private int index;
	private int totalPage;
	private int rowsInPage;
	private int offset;
	private static int ROWS_IN_PAGE=12;
	
	public Page() {
		
	}
	
	/**
	 * 适用于从查询结果总行数、页次
	 * @param totalRows
	 * @param index
	 */
	public Page resetFromTotal(int totalRows, int index) {
		this.totalRows = totalRows;
		this.index = index;
		this.rowsInPage = ROWS_IN_PAGE;
		this.rowsToPage();
		return this;
	}
	
	/**
	 * 适用于从查询结果总行数、页次
	 * @param totalRows
	 * @param index
	 * @param rowsInPage
	 */
	public Page resetFromTotal(int totalRows, int index, int rowsInPage) {
		this.totalRows = totalRows;
		this.index = index;
		this.rowsInPage = rowsInPage;
		this.rowsToPage();
		return this;
	}
	
	/**
	 * 适用于序查询偏移量
	 * @param index
	 * @param rowsInPage
	 */
	public Page resetFromIndex(int index, int rowsInPage) {
		this.index = index;
		this.rowsInPage = rowsInPage;
		pageToRows();
		return this;
	}
	
	/**
	 * 适用于根据页序查询偏移量
	 * @param index
	 */
	public Page resetFromIndex(int index) {
		this.index = index;
		this.rowsInPage = ROWS_IN_PAGE;
		pageToRows();
		return this;
	}
	
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getRowsInPage() {
		return rowsInPage;
	}
	public void setRowsInPage(int rowsInPage) {
		this.rowsInPage = rowsInPage;
	}
	
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}	

	public Page rowsToPage() {
		totalPage = totalRows / rowsInPage + (totalRows % rowsInPage > 0 ? 1 : 0);
		offset = Math.max(index, 0) * rowsInPage;
		return this;
	}
	
	public Page pageToRows() {
		offset = Math.max(index, 0) * rowsInPage;
		return this;
	}
	
	public int getIndexDisplay() {
		return index+1;
	}
	
	public List<Integer> getNearPages() {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = Math.max(index-5, 0); i<Math.min(index+5, totalPage); i++) {
			list.add(i);
		}
		return list;
	}

}
