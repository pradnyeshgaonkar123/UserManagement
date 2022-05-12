package com.usermanagement.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name = "USER_TBL")
public class User {
	
	@Id
	@Column(name = "user_id")//for creation of database only
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(max = 65)
	private String name;
	

	@Size(max = 65)
	@Column(unique = true)
	private String username;
	
	
	@NotNull
	@Size(max = 120)
	@Column(unique = true)
	private String email;
	
	

	@Size(max = 65)
	@Embedded
	private Address address;
	

	@Size(max = 120)
	private String phone;
	
	
	@Size(max = 120)
	private String website;
	
	

	@Size(max = 120)
	@Embedded
	private Company company;
	
	
	
	
}
