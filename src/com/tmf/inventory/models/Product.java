package com.tmf.inventory.models;

public class Product {
	private long productId;
	private String productName,productCategory;
	private double productCost;
	
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	public long getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	
	public Product() {
		
	}

	public Product(long productId, String productName, String productCategory, double productCost) {
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productCost=" + productCost + "]";
	}

	
}
