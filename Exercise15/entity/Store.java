package com.htc.Exercise15.entity;

import java.util.Collections;
import java.util.List;

public class Store {
	private String storeId;
	private String storeName;
	private List<Product> products;
	
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Store(String storeId, String storeName, List<Product> products) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.products = products;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", products=" + products + "]";
	}
	
	public List<Product> sortedList() {
		Collections.sort(products);
		return products;
	}

}
