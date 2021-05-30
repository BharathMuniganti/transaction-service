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
public class OtherAccountDto {
	
	/*
	"other_account":{
	"id":"5780MRN4uBIgWYmWAhI3pdqbSpItvOw4culXP5FWHJA",
	"holder":{"name":"ALIAS_03C57D","is_alias":true},
	"number":"savings-kids-john","kind":"AC","IBAN":"4930396","swift_bic":null,
	"bank":{"national_identifier":null,"name":"rbs"},
	"metadata":{"public_alias":null,"private_alias":null,"more_info":null,"URL":null, 
		       "image_URL":null,"open_corporates_URL":null,
		       "corporate_location":null,"physical_location":null}
	}*/

	private String id ;
	private AccHolderDto holder ;
	private String number ;
	private String kind ;
	
	@JsonProperty(value="IBAN")
	private String iban ;
	
	@JsonProperty(value="swift_bic")
	private String swiftBic ;
	private BankDto bank ;
	private  MetadataDto metadata ;
	
	
	
}
