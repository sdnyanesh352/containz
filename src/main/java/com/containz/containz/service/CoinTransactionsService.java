package com.containz.containz.service;

import java.util.List;

import com.containz.containz.model.CoinTransaction;
import com.containz.containz.model.User;



public interface CoinTransactionsService {
	List<CoinTransaction> findByUser(User user);

}
