package com.bridgelabz.addressbookapp.model;

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
	private String city;
	private String state;
	private int zip;
	private String email;
//	@ElementCollection
//	@CollectionTable(name = "addressbook_phoneNumber",joinColumns = @JoinColumn(name = "id"))
	@Column(name = "phoneNumber")
	private int phoneNumber;
	
	
	public AddressBookData() {
		
	}
	
public AddressBookData( int addressBookId, AddressBookDTO  addressBookDTO) {
	this.id = addressBookId;
	this.updateAddressBookData(addressBookDTO);
	}



public AddressBookData(AddressBookDTO addressBookDTO) {
	// TODO Auto-generated constructor stub
}


public void updateAddressBookData(AddressBookDTO addressBookDTO) {
	this.firstName = addressBookDTO.firstName;
	this.lastName = addressBookDTO.lastName;
	this.address = addressBookDTO.address;
	this.city = addressBookDTO.city;
	this.state = addressBookDTO.state;
	this.zip = addressBookDTO.zip;
	this.email = addressBookDTO.email;
	this.phoneNumber = addressBookDTO.phoneNumber;
}


}
