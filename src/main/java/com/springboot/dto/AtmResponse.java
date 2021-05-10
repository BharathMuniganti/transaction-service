package com.springboot.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class AtmResponse implements Serializable{
	
	
	public AtmResponse() {
		
	}

	
	public AtmResponse(List<AtmDetails> listAtmDetails) {
		super();
		this.listAtmDetails = listAtmDetails;
	}

	private List<AtmDetails> listAtmDetails ;

	public List<AtmDetails> getListAtmDetails() {
		return listAtmDetails;
	}

	public void setListAtmDetails(List<AtmDetails> listAtmDetails) {
		this.listAtmDetails = listAtmDetails;
	} 
	
	

}
