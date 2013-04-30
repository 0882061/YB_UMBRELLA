package com.ydev.service.app;

import java.util.List;

import com.ydev.domain.Product;

public interface IProductManager {
		
	public List<Product> getProducts();
	
	public List<Product> getProductsByStatus(Integer status);
	
	public List<Product> getProductsByFeNew(Integer feNew);
	
	public Product getProductById(String id);
	
	public Product getProductByType(String type);

	public List<Product> getProductsInPromo(String promo,Integer status);
	
	public List<Product> getProductsInSpecialPage(final Integer start,final Integer limit,final Integer status);
	
	public List<Product> getProductsPage(final Integer status,final Integer start,final Integer limit);
	
	public Integer countProduct(Integer status);
	
	public Integer countProductInSpecial(final Integer status);
}
