package com.containz.containz.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.containz.containz.model.CoinTransaction;
import com.containz.containz.model.User;
import com.containz.containz.service.CoinTransactionsService;

@Component
public class CoinTransactionsServiceImpl implements CoinTransactionsService{

	@Override
	public List<CoinTransaction> findByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
