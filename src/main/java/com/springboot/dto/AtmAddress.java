package com.springboot.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class AtmAddress implements Serializable{
	
	/*
	{"street":"Boonstraat","housenumber":"21","postalcode":"3195 BA","city":"Pernis Rotterdam",
		  "geoLocation":{"lat":"51.88781","lng":"4.38571"}}
	
	*/
	
	/*{"address":{"street":"Praagsingel","housenumber":"62","postalcode":"3404 CD","city":"IJsselstein",
		"geoLocation":{"lat":"52.010063","lng":"5.040549"}
	}
	*/
	
	private String street ;
	private String housenumber ;
	private String postalcode ;
	private String city ;
	private GeoLocationDto geoLocation ;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public GeoLocationDto getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocationDto(GeoLocationDto geoLocation) {
		this.geoLocation = geoLocation;
	}

	
	
	
	
}
