package com.backbase.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDto {
	
	private String id ;
	private List<AccHolderDto> holders ;
	private String number ;
	private String kind ;
	
	@JsonProperty(value="IBAN")
	private String iban ;
	
	@JsonProperty(value="swift_bic")
	private String swiftBic ;
	private BankDto bank ;
	
	
	
}
