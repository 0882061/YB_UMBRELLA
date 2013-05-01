package com.ydev.service.app.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ydev.domain.Product;
import com.ydev.service.app.IProductManager;
import com.ydev.util.CollectionsUtil;
import com.ydev.util.ResultUtil;

@SuppressWarnings("unchecked")
public class ProductManagerImpl extends HibernateDaoSupport implements
		IProductManager {

	private static final Log logger = LogFactory.getLog(ProductManagerImpl.class);
	
	public List<Product> getProducts() {
		String hql = "from Product";
		List<Product> list = (List<Product>) getHibernateTemplate().find(hql);
		return list != null ? list : new ArrayList<Product>();
	}

	public List<Product> getProductsByStatus(Integer status) {
		StringBuffer hql = new StringBuffer("from Product where 1 = 1");
		hql.append(" and status = ?");

		List<Object> params = new ArrayList<Object>();
		params.add(status);

		List<Product> list = (ArrayList<Product>) getHibernateTemplate().find(
				hql.toString(), params.toArray());

		return list != null ? list : new ArrayList<Product>();
	}

	public List<Product> getProductsByFeNew(Integer feNew) {
		StringBuffer hql = new StringBuffer("from Product where 1 = 1");
		hql.append(" and fenew = ?");

		List<Object> params = new ArrayList<Object>();
		params.add(feNew);

		List<Product> list = (ArrayList<Product>) getHibernateTemplate().find(
				hql.toString(), params.toArray());

		return list != null ? list : new ArrayList<Product>();
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

		List<Product> list = (ArrayList<Product>) getHibernateTemplate().find(
				hql.toString(), params.toArray());

		Product product = ResultUtil.firstResult(list);
		return product;
	}

	public List<Product> getProductsInPromo(String promo, Integer status) {
		StringBuffer hql = new StringBuffer("from Product where 1 = 1");
		if ("yes".equals(promo)) {
			hql.append(" and promo is not null");
			hql.append(" and promo !=''");
		} else if ("no".equals(promo)) {
			hql.append(" and (promo is null");
			hql.append(" or promo ='')");
		}

		List<Object> params = new ArrayList<Object>();
		if (null != status) {
			hql.append(" and status =?");
			params.add(status);
		}

		List<Product> list = (ArrayList<Product>) getHibernateTemplate().find(
				hql.toString(), params.toArray());
		return list;
	}
	
	public List<Product> getProductsInSpecialPage(final Integer start,final Integer limit,final Integer status) {
		StringBuffer hql = new StringBuffer("from Product where 1 = 1");
		hql.append(" and promo is not null");
		hql.append(" and promo !=''");
		hql.append(" and promo NOT LIKE '%!%%' ESCAPE '!'" );

		if (null != status) {
			hql.append(" and status =?");
		}
		final String callHql = hql.toString();

		List<Product> specs = (List<Product>) getHibernateTemplate()
				.executeFind(new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(callHql);
						if (null != status) {
							query.setInteger(0, status);
						}
						query.setFirstResult(start);
						query.setMaxResults(limit);
						List list = query.list();
						return list;
					}
				});
		CollectionsUtil.dealWithNull(specs);
		return specs;
	}
	
	public Integer countProductInSpecial(final Integer status) {
		StringBuffer hql = new StringBuffer(
				"select count(*) from Product where 1=1");
		hql.append(" and promo is not null");
		hql.append(" and promo !=''");
		hql.append(" and promo NOT LIKE '%!%%' ESCAPE '!'" );
		
		if (null != status) {
			hql.append(" and status = ?");
		}

		final String callHql = hql.toString();
		List backList = getHibernateTemplate()
				.executeFind(new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(callHql);
						if (null != status) {
							query.setInteger(0, status);
						};
						return query.list();
					}
				});
		
		Integer count = 0;
		try {
			count = ((Long)ResultUtil.firstResult(backList)).intValue();
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
		return count;
	}

	public List<Product> getProductsPage(final Integer status,
			final Integer start, final Integer limit) {
		StringBuffer hql = new StringBuffer("from Product where 1=1");
		if (null != status) {
			hql.append(" and status = ?");
		}

		final String callHql = hql.toString();
		List<Product> pros = (List<Product>) getHibernateTemplate()
				.executeFind(new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(callHql);
						if (null != status) {
							query.setInteger(0, status);
						}
						query.setFirstResult(start);
						query.setMaxResults(limit);
						List list = query.list();
						return list;
					}
				});
		CollectionsUtil.dealWithNull(pros);
		return pros;
	}

	public Integer countProduct(final Integer status) {
		StringBuffer hql = new StringBuffer(
				"select count(*) from Product where 1=1");
		if (null != status) {
			hql.append(" and status = ?");
		}

		final String callHql = hql.toString();
		List backList = getHibernateTemplate()
				.executeFind(new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(callHql);
						if (null != status) {
							query.setInteger(0, status);
						};
						return query.list();
					}
				});
		
		Integer count = 0;
		try {
			count = ((Long)ResultUtil.firstResult(backList)).intValue();
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
		return count;
	}

}
