package com.bridgelabz.addressbookapp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String email;
	private int phoneNumber;
	
	public AddressBookData(int addressBookId, AddressBookDTO addressBookDTO) {
		this.id = addressBookDTO.addressBookId;
		this.firstName = addressBookDTO.firstName;
		this.lastName = addressBookDTO.lastName;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zip = addressBookDTO.zip;
		this.email = addressBookDTO.email;
		this.phoneNumber = addressBookDTO.phoneNumber;
	}
	
	public AddressBookData() {
		super();
	}

}
