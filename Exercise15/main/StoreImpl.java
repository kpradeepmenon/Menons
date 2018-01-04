package com.htc.Exercise15.main;

import java.util.ArrayList;
import java.util.List;

import com.htc.Exercise15.entity.Product;
import com.htc.Exercise15.entity.Store;

public class StoreImpl {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("P001","Bread",2.49));
		products.add(new Product("P002","Butter",4.99));
		products.add(new Product("P003","Jam",3.49));
	
		Store stores = new Store("S001","FreshM",products);
		
		

	}

}
