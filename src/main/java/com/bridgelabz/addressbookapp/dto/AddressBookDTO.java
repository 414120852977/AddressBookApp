package com.bridgelabz.addressbookapp.dto;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.ToString;


public @ToString class AddressBookDTO {
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int addressBookId;
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "first  name Invalid")
	@NotEmpty(message="first Name should not be empty")
	public String firstName;
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "last  name Invalid")
	@NotEmpty(message="last Name should not be empty")
	public String lastName;
	@NotEmpty(message="address should not be empty")
	public String address;
	@NotEmpty(message="city should not be empty")
	public String city;
	@NotEmpty(message="state should not be empty")
	public String state;
	@NotEmpty(message="zip should not be empty")
	public int zip;
	@Email(message="please correct your email")
	public String email;
	@NotEmpty(message="phone number should not be empty")
	public int phoneNumber;

}
