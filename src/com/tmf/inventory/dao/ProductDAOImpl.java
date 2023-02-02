package com.tmf.inventory.dao;

import java.util.ArrayList;
import java.util.List;

import com.tmf.inventory.models.Product;

public class ProductDAOImpl implements ProductDAO{
	List<Product> products = new ArrayList<Product>();
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		products.add(product);
		System.out.println("Product has been added successfully");
	}

	@Override
	public void displayProduct(Product product) {
		// TODO Auto-generated method stub
		int flag = 0;
		Product p=null;
		for(Product pro : products) {
			if(pro.getProductId() == product.getProductId()) {
				flag++;
				p = pro;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Product has not found");
		}
		else {
			System.out.println(p);
		}
	}

	@Override
	public List<Product> displayProduct() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public List<Product> displayProduct(String productName) {
		// TODO Auto-generated method stub
		List<Product> pros = new ArrayList<Product>();
		for(Product pro : products) {
			if(pro.getProductName().equals(productName)) {
				pros.add(pro);
			}
		}
		return pros;
	}

	@Override
	public Product displayProduct(long productId) {
		// TODO Auto-generated method stub
		int flag = 0;
		Product p=new Product();
		p.setProductId(0);
		//System.out.println(productId);
		for(Product pro : products) {
			if(pro.getProductId() == productId) {
				flag++;
				p = pro;
				break;
			}
		}
		
		return p;
	}

	@Override
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

}
