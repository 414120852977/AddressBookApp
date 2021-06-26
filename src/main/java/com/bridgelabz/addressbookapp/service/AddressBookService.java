package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class AddressBookService implements IAddressBookService{
	
	@Autowired
	 private AddressBookRepository addressBookRepository;
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookRepository.findAll();
	}

	@Override
	public AddressBookData getAddressBookDataById(int addressbookId) {
		// TODO Auto-generated method stub
		return addressBookRepository
				.findById(addressbookId)
				.orElseThrow(() -> new AddressBookException("Addressbook with addressbook id:"+addressbookId + "does not exist..!!!"));
		
	}

	@Override
	public AddressBookData createEmployeePayrollData(AddressBookDTO addressBookDTO) {
		AddressBookData  addressBookData = null;
		addressBookData = new AddressBookData(addressBookDTO);
		log.debug("AddressBook Data:"+addressBookData.toString());
		return addressBookRepository.save(addressBookData);
	}

	@Override
	public AddressBookData updateAddressBookData(int addressbookId, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = this.getAddressBookDataById(addressbookId);
		addressBookData.updateAddressBookData(addressBookDTO);;
		return addressBookRepository.save(addressBookData);
	}

	@Override
	public void deleteAddressBookData(int addressbookId) {
		// TODO Auto-generated method stub
		addressBookRepository.deleteById(addressbookId);
	}
	

}
