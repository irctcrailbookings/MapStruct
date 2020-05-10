package com.citi.app.practice;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
