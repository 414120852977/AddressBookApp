package com.bridgelabz.addressbookapp.dto;



import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "first  name Invalid")
	@NotEmpty(message="first Name should not be empty")
	public String firstName;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "last  name Invalid")
	@NotEmpty(message="last Name should not be empty")
	public String lastName;
	
	@NotEmpty(message="address should not be empty")
	public String address;
	
	@NotEmpty(message="city should not be empty")
	public List<String> city;
	
	@NotEmpty(message="state should not be empty")
	public String state;
	
	
	public int zip;
	
	
	public String email;
	
	
	public int phoneNumber;

}
