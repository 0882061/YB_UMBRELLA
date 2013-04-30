package com.ybase.test.service;

import java.util.List;

import org.junit.Test;

import com.ybase.test.base.BaseTestSevice;
import com.ydev.domain.Product;
import com.ydev.service.app.IProductManager;

public class TestProductManager extends BaseTestSevice {

	private IProductManager productManager;
	
	@Test
	public void testGetProducts(){
		List<Product> list = productManager.getProducts();
		assertEquals(16, list.size());
	}
	
	@Test
	public void testGetProductsByStatus(){
		List<Product> list = productManager.getProductsByStatus(0);
		assertEquals(2, list.size());
	}
	
	@Test
	public void testGetProductsByFeNew(){
		List<Product> list = productManager.getProductsByFeNew(1);
		assertEquals(4, list.size());
	}
	
	@Test
	public void testGetProductById(){
		Product product = productManager.getProductById("3");
		assertNotNull(product);
		assertEquals("蜡纸伞01", product.getType());
		assertEquals("89%", product.getPromo());	
	}
	
	@Test
	public void testGetProductByType(){
		Product product = productManager.getProductByType("蜡纸伞01");
		assertNotNull(product);
		assertEquals("3", product.getId());
		assertEquals("89%", product.getPromo());	
	}
	
	@Test
	public void testGetProductsPage(){
		List<Product> prosPage = productManager.getProductsPage(1, 0, 3);
		assertEquals(3, prosPage.size());
		
		prosPage = productManager.getProductsPage(1, 4, 6);
		assertEquals(6, prosPage.size());
		
		prosPage = productManager.getProductsPage(1, 5, 6);
		assertEquals(5, prosPage.size());
		
		prosPage = productManager.getProductsPage(1, 0, 20);
		assertEquals(10, prosPage.size());
	}
	
	@Test
	public void testCountProduct(){
		int count = productManager.countProduct(1);
		assertEquals(10, count);
	}
	
	@Test
	public void testGetProductsInSpecialPage() {
		List<Product> specs = productManager.getProductsInSpecialPage(0, 4, 1);
		assertEquals(3, specs.size());
	}
	
	@Test
	public void testCountProductInSpecial() {
		int count = productManager.countProductInSpecial(1);
		assertEquals(3, count);
	}

	public void setProductManager(IProductManager productManager) {
		this.productManager = productManager;
	}
	
}
