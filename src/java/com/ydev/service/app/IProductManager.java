package com.ydev.service.app;

import java.util.List;

import com.ydev.domain.Product;

public interface IProductManager {
		
	public List<Product> getProducts();
	
	public List<Product> getProductsByStatus(Integer status);
	
	public List<Product> getProductsByFeNew(Integer feNew);
	
	public Product getProductById(String id);
	
	public Product getProductByType(String type);
}
