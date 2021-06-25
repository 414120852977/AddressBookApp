package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;

@Service
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
		return addressBookList.get(addressbookId-1);
		
	}

	@Override
	public AddressBookData createEmployeePayrollData(AddressBookDTO addressBookDTO) {
		// TODO Auto-generated method stub
		
		AddressBookData addressbookdata  = null;
		addressbookdata = new AddressBookData(addressBookList.size()+1, addressBookDTO);
		addressBookList.add(addressbookdata);
		return addressbookdata;
	}

	@Override
	public AddressBookData updateAddressBookData(int addressbookId, AddressBookDTO addressBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressbookdata = this.getAddressBookDataById(addressbookId);
		addressbookdata.setFirstName(addressBookDTO.firstName);
		addressbookdata.setLastName(addressBookDTO.lastName);
		addressbookdata.setAddress(addressBookDTO.address);
		addressbookdata.setCity(addressBookDTO.city);
		addressbookdata.setState(addressBookDTO.state);
		addressbookdata.setZip(addressBookDTO.zip);
		addressbookdata.setEmail(addressBookDTO.email);
		addressbookdata.setPhoneNumber(addressBookDTO.phoneNumber);
		
		addressBookList.set(addressbookId-1,  addressbookdata);
		return addressbookdata;
	}

	@Override
	public void deleteAddressBookData(int addressbookId) {
		// TODO Auto-generated method stub
		addressBookList.remove(addressbookId-1);
	}
	

}
