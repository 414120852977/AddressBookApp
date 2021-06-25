package com.bridgelabz.addressbookapp.dto;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class AddressBookDTO {
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public int zip;
	public String email;
	public int phoneNumber;
	public AddressBookDTO(String firstName, String lastName, String address, String city, String state, int zip,
			String email, int phoneNumber) {
		super();
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
