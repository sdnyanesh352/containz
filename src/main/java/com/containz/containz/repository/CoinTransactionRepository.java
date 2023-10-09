package com.containz.containz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.containz.containz.model.CoinTransaction;
import com.containz.containz.model.User;


public interface CoinTransactionRepository extends CrudRepository<CoinTransaction, Long> {

	List<CoinTransaction> findByUser(User user);

}
