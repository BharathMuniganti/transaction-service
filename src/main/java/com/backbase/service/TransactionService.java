package com.backbase.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backbase.dto.BackbaseResponse;

@Service
public interface TransactionService {

	
    List<BackbaseResponse> getAllTransactions() ;
	
	List<BackbaseResponse> getAllTransactionsByTransactionType(String transactionType);
	
	Double getTotalAmountByTransactionType(String transactionType);
	
}
