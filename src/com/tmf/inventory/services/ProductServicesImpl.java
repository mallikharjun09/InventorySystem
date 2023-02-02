package com.tmf.inventory.services;

import java.util.List;
import java.util.Scanner;

import com.tmf.inventory.dao.ProductDAO;
import com.tmf.inventory.dao.ProductDAOImpl;
import com.tmf.inventory.models.Product;

public class ProductServicesImpl implements ProductServices{
	private long productId = 10000000001L;
	Scanner scan = new Scanner(System.in);
	ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public void addProduct() {
		// Accept data from the user
		System.out.println("Enter the Product Name ");
		String pname = scan.nextLine();
		scan.nextLine();
		System.out.println("Enter Product Category");
		String cat = scan.nextLine();
		scan.nextLine();
		System.out.println("Enter Product Cost");
		double pcost = scan.nextDouble();
		
		//Add details to the product object.
		Product p = new Product();
		
		p.setProductCategory(cat);
		p.setProductCost(pcost);
		p.setProductId(productId);
		p.setProductName(pname);
		
		//Add product to the Products list in DAO class
		dao.addProduct(p);
		
		//Increase Product Id
		productId++;
	}

	@Override
	public void displayProductById() {
		// TODO Auto-generated method stub
		System.out.println("Enter the product ID");
		long pid = scan.nextLong();
		//scan.nextLine();
		Product p = dao.displayProduct(pid);
		if(p.getProductId() == 0) {
			System.out.println("Sorry Product has not found");
		}
		else {
			dao.displayProduct(p);
		}
	}

	@Override
	public void displayAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products = dao.displayProduct();
		for(Product pro : products) {
			dao.displayProduct(pro);
		}
	}

	@Override
	public void displayProductByName() {
		// TODO Auto-generated method stub
		System.out.println("Enter the product name ");
		String pname = scan.nextLine();
		scan.nextLine();
		List<Product> products = dao.displayProduct(pname);
		for(Product pro : products) {
			dao.displayProduct(pro);
		}
	}

	@Override
	public void updateProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menu() {
		while(true) {
			System.out.println("========================INVENTORY SYSTEM=====================");
			System.out.println("Press 1 for Add New Product");
			System.out.println("Press 2 for Display All Available Products");
			System.out.println("Press 3 for Display Product By ID");
			System.out.println("Press 4 for Display Products By Name");
			System.out.println("Press 0 for Exit");
			System.out.println("Please Enter your choice ");
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 0 : System.exit(choice);
			case 1 : addProduct();break;
			case 2 : displayAllProducts();break;
			case 3 : displayProductById();break;
			case 4 : displayProductByName();break;
			default : System.out.println("Sorry!!!! You have entered a wrong choice...");
			}
		}
	}

}
