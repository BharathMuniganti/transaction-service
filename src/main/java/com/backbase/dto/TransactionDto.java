package com.backbase.dto;

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
public class TransactionDto {
	/*
	{"id":"58aeed54-7042-456d-af86-f517bff5b7af",
		"this_account":{"id":"savings-kids-john","holders":[{"name":"Savings - Kids John","is_alias":false}],"number":"832425-00304050","kind":"savings","IBAN":null,"swift_bic":null,"bank":{"national_identifier":"rbs","name":"The Royal BankDto of Scotland"}},
		"other_account":{"id":"5780MRN4uBIgWYmWAhI3pdqbSpItvOw4culXP5FWHJA","holder":{"name":"ALIAS_03C57D","is_alias":true},"number":"savings-kids-john","kind":"AC","IBAN":"4930396","swift_bic":null,"bank":{"national_identifier":null,"name":"rbs"},"metadata":{"public_alias":null,"private_alias":null,"more_info":null,"URL":null,"image_URL":null,"open_corporates_URL":null,"corporate_location":null,"physical_location":null}},
		"details":{"type":"SEPA","description":"This is a SEPA TransactionDto Request","posted":"2020-06-05T08:28:38Z","completed":"2020-06-05T08:28:38Z","new_balance":{"currency":"GBP","amount":null},"value":{"currency":"GBP","amount":"8.60"}},
		"metadata":{"narrative":null,"comments":[],"tags":[],"images":[],"where":null}
	}
    */
	
	@JsonProperty(value="id")
	private String id ;
	
	@JsonProperty(value="this_account")
	private AccountDto thisAccount ;
	
	@JsonProperty(value="other_account")
	private OtherAccountDto otherAccount ;
	
	@JsonProperty(value="details")
	private DetailsDto details ;

	
	
}
