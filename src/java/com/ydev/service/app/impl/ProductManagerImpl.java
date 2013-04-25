package com.ydev.service.app.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ydev.domain.Product;
import com.ydev.service.app.IProductManager;
import com.ydev.util.ResultUtil;

@SuppressWarnings("unchecked")
public class ProductManagerImpl extends HibernateDaoSupport implements
		IProductManager {

	public List<Product> getProducts() {
		String hql = "from Product";
		List<Product> list = (List<Product>)getHibernateTemplate().find(hql);
		return list != null ? list:new ArrayList<Product>();
	}

	public List<Product> getProductsByStatus(Integer status) {
		StringBuffer hql = new StringBuffer("from Product where 1 = 1");
		hql.append(" and status = ?");
		
		List<Object> params = new ArrayList<Object>();
		params.add(status);
		
		List<Product> list = (ArrayList<Product>)getHibernateTemplate().find(hql.toString(),params.toArray());
		
		return list !=null ? list:new ArrayList<Product>();
	}

	public List<Product> getProductsByFeNew(Integer feNew) {
		StringBuffer hql = new StringBuffer("from Product where 1 = 1");
		hql.append(" and fenew = ?");
		
		List<Object> params = new ArrayList<Object>();
		params.add(feNew);
		
		List<Product> list = (ArrayList<Product>)getHibernateTemplate().find(hql.toString(),params.toArray());
		
		return list !=null ? list:new ArrayList<Product>();
	}

	public Product getProductById(String id) {
		Product product = getHibernateTemplate().get(Product.class, id);
		return product;
	}


	public Product getProductByType(String type) {
		StringBuffer hql = new StringBuffer("from Product where 1 = 1");
		hql.append(" and type = ?");
		
		List<Object> params = new ArrayList<Object>();
		params.add(type);
		
		List<Product> list = (ArrayList<Product>)getHibernateTemplate().find(hql.toString(),params.toArray());
		
		Product product = ResultUtil.firstResult(list);
		return product;
	}

}
