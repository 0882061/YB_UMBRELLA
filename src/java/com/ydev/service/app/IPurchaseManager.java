package com.ydev.service.app;

import java.util.List;

import com.ydev.domain.Purchase;

public interface IPurchaseManager {

	public List<Purchase> getPurchases();
	
	public List<String> getMerchants();
}
