package com.usermanagement.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
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
	@NotNull
	private String username;
	
	
	@NotNull
	@Size(max = 120)
	@Column(unique = true)
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
	private String email;
	
	

	@Embedded
	private Address address;
	

	@Size(max = 120)
	@Column(unique = true)
	@NotNull
	private String phone;
	
	
	@Size(max = 120)
	private String website;
	
	

	@Embedded
	private Company company;
	
	
	




	public User(Long id, @Size(max = 65) String name, @Size(max = 65) @NotNull String username,
			@NotNull @Size(max = 120) @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}") String email,
			Address address, @Size(max = 120) @NotNull String phone, @Size(max = 120) String website, Company company) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.company = company;
	}



	public User() {
		super();
	}
	
	
	
	
	
}
