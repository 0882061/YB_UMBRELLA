package com.ydev.service.app.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ydev.domain.Shop;
import com.ydev.service.app.IShopManager;
import com.ydev.util.ResultUtil;

public class ShopManagerImpl extends HibernateDaoSupport implements IShopManager {

	@SuppressWarnings("unchecked")
	public Shop getShop() {
			StringBuffer hql = new StringBuffer("from Shop where 1=1");
			return ResultUtil.firstResult((List<Shop>)getHibernateTemplate().find(hql.toString()));
	}
	
}
