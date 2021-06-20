package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{
	private List<AddressBookData> addressBookList = new ArrayList<>();
	@Override
	public List<AddressBookData> getAddressBookData() {
		
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
		AddressBookData  addressbookdata = null;
		addressbookdata = new AddressBookData(1, addressBookDTO);
		return addressbookdata;
	}

	@Override
	public AddressBookData updateAddressBookData(int addressbookId, AddressBookDTO addressBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressbookdata = null;
		addressbookdata = new AddressBookData(addressbookId,  addressBookDTO);
		return addressbookdata;
	}

	@Override
	public void deleteAddressBookData(int addressbookId) {
		// TODO Auto-generated method stub
		addressBookList.remove(addressbookId-1);
	}
	

}
