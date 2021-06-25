package com.bridgelabz.addressbookapp.dto;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


public class AddressBookDTO {
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
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
	public AddressBookDTO(int id ,String firstName, String lastName, String address, String city, String state, int zip,
			String email, int phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "AddressBookDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	
}
