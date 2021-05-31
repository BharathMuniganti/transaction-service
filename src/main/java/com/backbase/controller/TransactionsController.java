package com.backbase.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.backbase.dto.BackbaseResponse;
import com.backbase.dto.MetadataDto;
import com.backbase.dto.OtherAccountDto;
import com.backbase.dto.TransactionDto;
import com.backbase.dto.TransactionsResponse;
import com.backbase.mapper.BackbaseResponseMapper;
import com.backbase.service.TransactionService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RequestMapping("/transactions")
@RestController
public class TransactionsController {
	
	@Autowired
	TransactionService transactionService;
	
	
	@GetMapping()
	public List<BackbaseResponse> getAllAtmDetails() throws JsonParseException, JsonMappingException, IOException{
		
		return transactionService.getAllTransactions();
	}

	
	@GetMapping("/search")
	public List<BackbaseResponse> getAllByTransactionType(@RequestParam(value="transactionType") String transactionType ) throws JsonParseException, JsonMappingException, IOException{
		
		return transactionService.getAllTransactionsByTransactionType(transactionType);
	}
	
	
	@GetMapping("/totalamount")
	public Double getTotalAmountByTransactionType(@RequestParam(value="transactionType") String transactionType ) throws JsonParseException, JsonMappingException, IOException{
      	
		return transactionService.getTotalAmountByTransactionType(transactionType);
	}

}
