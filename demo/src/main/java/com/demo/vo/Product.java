package com.demo.vo;

import java.util.List;

public class Product {
	
	private String productId;
	
	private String productName;
	
	private String productCat;
	
	private String productColor;
	
	private List<Sku> skus;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCat() {
		return productCat;
	}

	public void setProductCat(String productCat) {
		this.productCat = productCat;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public List<Sku> getSkus() {
		return skus;
	}

	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}
	
	

}
