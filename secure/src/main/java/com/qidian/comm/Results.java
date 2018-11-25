package com.qidian.comm;

import java.io.UnsupportedEncodingException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
/**
 * 
 * @title 
 * @author Xrt rong tao
 * @version 1.0.0
 * @since jdk1.8
 * @创建时间：2018年11月25日下午9:00:35
 * @功能描述：
 */
public enum Results {
	SUCCESS(0), INTENAL_ERROR(1), RESOURCE_NOT_FOUND(2) ;

	private int code;

	private Results(int code) {
		this.code = code;
	}

	public Result build() {
		Result result = new Result();
		result.setCode(this.code);
		if (this != SUCCESS) {
			try {
				String e = ResourceBundle.getBundle("message").getString(this.name());
				result.setReason(new String(e.getBytes("iso-8859-1"), "utf-8"));
			} catch (MissingResourceException arg2) {
				result.setReason(this.name());
			} catch (UnsupportedEncodingException arg3) {
				;
			}
		}

		return result;
	}

	public Result build(Object data) {
		return this.build().setData(data);
	}

	public Result build(Object data, Object att) {
		return this.build().setData(data).setAtt(att);
	}

	public static Result detectResource(Object resource) {
		return (resource == null ? RESOURCE_NOT_FOUND : SUCCESS).build().setData(resource);
	}
}