package com.backbase.dto;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data ;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class BackbaseResponse implements Serializable{
	  
	
	 private String id ;
	 private String accountId ;
	 private String counterpartyAccount ;
	 private String counterpartyName ;
	 private String counterPartyLogoPath ;
	 private String instructedAmount ;
	 private String instructedCurrency ;
	 private String transactionAmount ;
	 private String transactionCurrency ;
	 private String transactionType ;
	 private String description ;
	 
	
	
}
