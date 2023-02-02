package com.tmf.inventory.dao;

import java.util.List;

import com.tmf.inventory.models.Product;

public interface ProductDAO {
	public void addProduct(Product product);
	public void displayProduct(Product product);
	public List<Product> displayProduct();
	public List<Product> displayProduct(String productName);
	public Product displayProduct(long productId);
	public void deleteProduct(Product product);
	public void updateProduct(Product product);
}
