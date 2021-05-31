package com.backbase.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backbase.dto.BackbaseResponse;
import com.backbase.dto.TransactionDto;
import com.backbase.dto.TransactionsResponse;
import com.backbase.mapper.BackbaseResponseMapper;
import com.backbase.service.TransactionService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	BackbaseResponseMapper backbaseResponseMapper ;
	
	
	@Override
	public List<BackbaseResponse> getAllTransactions() {
		ResponseEntity<String> response = null ;
		TransactionsResponse transactionsResponse = null ;
		List<BackbaseResponse> listBackbaseResponse = new ArrayList<>() ;
		
		try{
			RestTemplate restTemplate = new RestTemplate();
			String fooResourceUrl
			  = "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions";
			
			 response = restTemplate.getForEntity(fooResourceUrl, String.class);
			
			ObjectMapper objMapper = new ObjectMapper();
		    transactionsResponse = objMapper.readValue(response.getBody() ,
					new TypeReference<TransactionsResponse>(){
			});
			      	
			 listBackbaseResponse = 	backbaseResponseMapper.convertToDtoList(transactionsResponse.getTransactions());
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return listBackbaseResponse ;
	}

	@Override
	public List<BackbaseResponse> getAllTransactionsByTransactionType(String transactionType) {
		
		List<BackbaseResponse> listBackbaseResponse = getAllTransactions();
		List<BackbaseResponse> filterListBackbaseResponse =  listBackbaseResponse.stream().filter(t -> transactionType.equalsIgnoreCase(t.getTransactionType())).collect(Collectors.toList());
	        
	    return listBackbaseResponse ;
	}

	@Override
	public Double getTotalAmountByTransactionType(String transactionType) {
		
		Double totalAmountByTransactionType = 0d ;
		List<BackbaseResponse> listBackbaseResponse = getAllTransactions();
		List<BackbaseResponse> filterListBackbaseResponse =  listBackbaseResponse.stream().filter(t -> transactionType.equalsIgnoreCase(t.getTransactionType())).collect(Collectors.toList());
		
		
		 totalAmountByTransactionType = filterListBackbaseResponse.stream()
                .mapToDouble(s -> Double.parseDouble(s.getTransactionAmount())).sum();
				        
		return totalAmountByTransactionType ;
	}

	
}
