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
public class MetadataDto {

	@JsonProperty(value="public_alias")
	private String publicAlias ;
	
	@JsonProperty(value="private_alias")
	private String privateAlias ;
	
	@JsonProperty(value="more_info")
	private String moreInfo ;
	
	
	@JsonProperty(value="URL")
	private String url ;
	
	@JsonProperty(value="image_URL")
	private String imageURL ;
	
	@JsonProperty(value="open_corporates_URL")
	private String openCorporatesURL ;
	
	@JsonProperty(value="corporate_location")
	private String corporateLocation ;
	
	@JsonProperty(value="physical_location")
	private String physicalLocation ;

	
	
}
