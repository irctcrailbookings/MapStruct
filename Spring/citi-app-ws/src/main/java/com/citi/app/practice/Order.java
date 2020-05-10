package com.citi.app.practice;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Order {
	private String orderFinishDate;
	private List<Product> orderedProducts;
    private int orderId;
    public String getOrderFinishDate() {
		return orderFinishDate;
	}
	public void setOrderFinishDate(String orderFinishDate) {
		this.orderFinishDate = orderFinishDate;
	}
	public List<Product> getOrderedProducts() {
		return orderedProducts;
	}
	public void setOrderedProducts(List<Product> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
}
