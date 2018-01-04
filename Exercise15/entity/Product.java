package com.htc.Exercise15.entity;

public class Product implements Comparable<Product> {
	private String prodId;
	private String prodDesc;
	private double price;
	
	public Product() {
		super();
		this.prodId = "";
		this.prodDesc = "";
		this.price = 0.0;
	}
	
	public Product(String prodId, String prodDesc, double price) {
		super();
		this.prodId = prodId;
		this.prodDesc = prodDesc;
		this.price = price;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodDesc=" + prodDesc + ", price=" + price + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((prodDesc == null) ? 0 : prodDesc.hashCode());
		result = prime * result + ((prodId == null) ? 0 : prodId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (prodDesc == null) {
			if (other.prodDesc != null)
				return false;
		} else if (!prodDesc.equals(other.prodDesc))
			return false;
		if (prodId == null) {
			if (other.prodId != null)
				return false;
		} else if (!prodId.equals(other.prodId))
			return false;
		return true;
	}

	@Override
	public int compareTo(Product o) {
		
		return new Double((this.getPrice()).compareTo(new Double(o.getPrice()));
	}
	
	

}
