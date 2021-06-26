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
	private List<AddressBookData> addressBookList = new ArrayList<>();
	@Override
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> addressBookList = (List<AddressBookData>)this.addressBookRepository.findAll();
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int addressbookId) {
		// TODO Auto-generated method stub
		return addressBookList.stream()
				.filter(adressData -> adressData.id == addressbookId)
				.findFirst()
				.orElseThrow(() -> new AddressBookException("Employee Not Found"));
		
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
		addressBookList.remove(addressbookId-1);
	}
	

}
