package com.usermanagement.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Company {

	@Column(name = "company_name")
	private String name;
	private String catchPhrase;
	private String bs;

	
}
