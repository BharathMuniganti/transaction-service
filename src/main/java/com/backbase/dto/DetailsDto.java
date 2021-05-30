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
public class DetailsDto {
	
	private String type ;
	private String description ;
	private String posted ;
	private String completed ;
	
	@JsonProperty(value="new_balance")
	private NewBalanceDto newBalance ;

	
	private ValueDto value ;

	
	
}
