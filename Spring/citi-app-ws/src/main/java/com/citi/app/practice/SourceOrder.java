package com.citi.app.practice;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class SourceOrder {
	private String orderFinishDat;
    private List<SourceProduct> orderedProducts;
    private int orderId;
	

	public String getOrderFinishDat() {
		return orderFinishDat;
	}
	public void setOrderFinishDat(String orderFinishDat) {
		this.orderFinishDat = orderFinishDat;
	}
	public List<SourceProduct> getOrderedProducts() {
		return orderedProducts;
	}
	public void setOrderedProducts(List<SourceProduct> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
 
}
