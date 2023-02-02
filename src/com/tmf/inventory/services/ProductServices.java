package com.tmf.inventory.services;

import java.util.Scanner;

import com.tmf.inventory.dao.ProductDAO;
import com.tmf.inventory.dao.ProductDAOImpl;

public interface ProductServices {
	public void addProduct();
	public void displayProductById();
	public void displayAllProducts();
	public void displayProductByName();
	public void updateProduct();
	public void deleteProduct();
	public void menu();
}
