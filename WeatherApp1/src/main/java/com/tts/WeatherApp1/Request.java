package com.tts.WeatherApp1;

import javax.persistence.Entity;

@Entity
public class Request {

	private String zipCode;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
