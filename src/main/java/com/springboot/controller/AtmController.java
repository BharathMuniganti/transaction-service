package com.springboot.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RequestMapping("/atms")
@RestController
public class AtmController {

	
	@GetMapping()
	public ResponseEntity<String> getAllAtmDetails() throws JsonParseException, JsonMappingException, IOException{
				
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "https://www.ing.nl/api/locator/atms/";
		
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl, String.class);
		
		String responseNew = response.getBody().substring(6) ;
		
		ObjectMapper objMapper = new ObjectMapper();
		com.springboot.dto.AtmDetails[] listReponse = objMapper.readValue(responseNew , new TypeReference<com.springboot.dto.AtmDetails[]>(){
		});
		        
		return response ;
	}

	
	@GetMapping("/search")
	public List<com.springboot.dto.AtmDetails> getAllAtmDetailsByCity(@RequestParam(value="city") String searchCity ) throws JsonParseException, JsonMappingException, IOException{
				
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "https://www.ing.nl/api/locator/atms/";
		
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl, String.class);
		
		String responseNew = response.getBody().substring(6) ;
		
		ObjectMapper objMapper = new ObjectMapper();
		com.springboot.dto.AtmDetails[] listReponse = objMapper.readValue(responseNew , new TypeReference<com.springboot.dto.AtmDetails[]>(){
		});
		
		List<com.springboot.dto.AtmDetails> atmList= new ArrayList();

		Collections.addAll(atmList, listReponse);
		

	List<com.springboot.dto.AtmDetails> searchList = 	atmList.stream().filter(e -> searchCity.equals(e.getAddress().getCity())).collect(Collectors.toList()) ;
		        
		return searchList ;
	}
	

}
