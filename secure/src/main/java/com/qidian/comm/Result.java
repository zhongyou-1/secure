package com.qidian.comm;

import java.io.Serializable;

/**
 * 
 * @title 
 * @author Xrt rong tao
 * @version 1.0.0
 * @since jdk1.8
 * @创建时间：2018年11月25日下午9:00:55
 * @功能描述：
 */
public class Result implements Serializable {
	private static final long serialVersionUID = 1L;
	private int code;
	private String reason;
	private Object data;
	private Object att;

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getReason() {
		return this.reason;
	}

	public Result setReason(String reason) {
		this.reason = reason;
		return this;
	}

	public Object getData() {
		return this.data;
	}

	public Result setData(Object data) {
		this.data = data;
		return this;
	}

	public Object getAtt() {
		return this.att;
	}

	public Result setAtt(Object att) {
		this.att = att;
		return this;
	}

	public boolean success() {
		return this.code == 0;
	}
}