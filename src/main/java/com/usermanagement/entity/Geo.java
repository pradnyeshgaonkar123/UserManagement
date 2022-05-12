package com.usermanagement.entity;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Geo {

	private String lat;
	private String lng;
	public Geo(String lat, String lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	public Geo() {
		super();
	}
	
	
	
	
}

