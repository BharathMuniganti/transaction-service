package com.springboot.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class OpeningHoursDto implements Serializable {


	private String dayOfWeek ;
	
	List<HoursDto> hours ;

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public List<HoursDto> getHours() {
		return hours;
	}

	public void setHours(List<HoursDto> hours) {
		this.hours = hours;
	}
	
	
	
}
