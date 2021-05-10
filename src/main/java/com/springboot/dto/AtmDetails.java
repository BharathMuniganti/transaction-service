package com.springboot.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class AtmDetails implements Serializable{
	
	/*
	{"address":{"street":"Praagsingel","housenumber":"62","postalcode":"3404 CD","city":"IJsselstein",
		"geoLocation":{"lat":"52.010063","lng":"5.040549"}
	},"distance":0,
		"openingHours":[{"dayOfWeek":2,"hours":[{"hourFrom":"08:00","hourTo":"21:00"}]},{"dayOfWeek":3,"hours":[{"hourFrom":"08:00","hourTo":"21:00"}]},{"dayOfWeek":4,"hours":[{"hourFrom":"08:00","hourTo":"21:00"}]},{"dayOfWeek":5,"hours":[{"hourFrom":"08:00","hourTo":"21:00"}]},{"dayOfWeek":6,"hours":[{"hourFrom":"08:00","hourTo":"21:00"}]},{"dayOfWeek":7,"hours":[{"hourFrom":"08:00","hourTo":"21:00"}]},
	                                                                                                                                                                                   {"dayOfWeek":1,"hours":[{"hourFrom":"10:00","hourTo":"19:00"}]}],
		"functionality":"Geldautomaat","type":"GELDMAAT"}
		*/
	
  private AtmAddress address;
  private long distance ;
  private List<OpeningHoursDto> openingHours ;
  
  private String functionality ;
  private String type ;
  
  public AtmDetails()
  {
	  
  }
public AtmDetails(AtmAddress address, long distance, List<OpeningHoursDto> openingHours, String functionality,
		String type) {
	super();
	this.address = address;
	this.distance = distance;
	this.openingHours = openingHours;
	this.functionality = functionality;
	this.type = type;
}
public AtmAddress getAddress() {
	return address;
}
public void setAddress(AtmAddress address) {
	this.address = address;
}
public long getDistance() {
	return distance;
}
public void setDistance(long distance) {
	this.distance = distance;
}
public List<OpeningHoursDto> getOpeningHours() {
	return openingHours;
}
public void setOpeningHours(List<OpeningHoursDto> openingHours) {
	this.openingHours = openingHours;
}
public String getFunctionality() {
	return functionality;
}
public void setFunctionality(String functionality) {
	this.functionality = functionality;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
	
  /*
	
  {"address":{"street":"Boonstraat","housenumber":"21","postalcode":"3195 BA","city":"Pernis Rotterdam",
	  "geoLocation":{"lat":"51.88781","lng":"4.38571"}},
	  "distance":0,
	  "openingHours":[
	                  {"dayOfWeek":2,"hours":[{"hourFrom":"07:00","hourTo":"23:00"}]},
	                  {"dayOfWeek":3,"hours":[{"hourFrom":"07:00","hourTo":"23:00"}]},
	                  {"dayOfWeek":4,"hours":[{"hourFrom":"07:00","hourTo":"23:00"}]},
	                  {"dayOfWeek":5,"hours":[{"hourFrom":"07:00","hourTo":"23:00"}]},
	                  {"dayOfWeek":6,"hours":[{"hourFrom":"07:00","hourTo":"23:00"}]},
	                  {"dayOfWeek":7,"hours":[{"hourFrom":"07:00","hourTo":"23:00"}]},
	                  {"dayOfWeek":1,"hours":[{"hourFrom":"07:00","hourTo":"23:00"}]}
	                  ],
	  "functionality":"Geldautomaat",
	  "type":"GELDMAAT"}
	  
	  */
  
  
  
}










