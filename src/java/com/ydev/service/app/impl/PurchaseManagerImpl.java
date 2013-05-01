package com.ydev.service.app.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ydev.domain.Purchase;
import com.ydev.service.app.IPurchaseManager;
import com.ydev.util.CollectionsUtil;

public class PurchaseManagerImpl extends HibernateDaoSupport implements
		IPurchaseManager {

	public List<Purchase> getPurchases() {
		//TODO
		return null;
	}

	public List<String> getMerchants() {
		StringBuffer hql = new StringBuffer("select merchant from Purchase");
		
		List<Object> params = new ArrayList<Object>();
		
		List<String> mercs = getHibernateTemplate().find(hql.toString(),params.toArray());
		CollectionsUtil.dealWithNull(mercs);
		return mercs;
	}

}
