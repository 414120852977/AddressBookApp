package com.bridgelabz.addressbookapp.model;



import java.util.List;

import javax.persistence.CollectionTable;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;
@Entity
@Table(name = "address_book")
public @Data class AddressBookData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	private String firstName;
	private String lastName;
	private String address;
	@ElementCollection
	@CollectionTable(name = "addressbook_city", joinColumns = @JoinColumn(name = "addressBookid"))
	@Column(name = "city")
	private List<String> citys;
	private String state;
	private int zip;
	private String email;
	
	private int phoneNumber;
	
	public AddressBookData() {
		
	}
	
	public AddressBookData( AddressBookDTO  addressBookDTO) {
		super();
	this.updateAddressBookData(addressBookDTO);
	}


	public void updateAddressBookData(AddressBookDTO addressBookDTO) {
	this.firstName = addressBookDTO.firstName;
	this.lastName = addressBookDTO.lastName;
	this.address = addressBookDTO.address;
	this.citys = addressBookDTO.city;
	this.state = addressBookDTO.state;
	this.zip = addressBookDTO.zip;
	this.email = addressBookDTO.email;
	this.phoneNumber = addressBookDTO.phoneNumber;
	}
}
