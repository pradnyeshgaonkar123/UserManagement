package com.usermanagement.entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.Data;

@Data
@Embeddable
public class Address {

	private String street;
	private String suite;
	private String city;
	private String zipcode;
	
	@Embedded
	private Geo geo;

	public Address(String street, String suite, String city, String zipcode, Geo geo) {
		super();
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
		this.geo = geo;
	}

	public Address() {
		super();
	}
	
	
	

}
