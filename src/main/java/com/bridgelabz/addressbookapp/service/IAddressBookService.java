package com.bridgelabz.addressbookapp.service;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface IAddressBookService {
List<AddressBookData> getAddressBookData();
	
AddressBookData getAddressBookDataById(int addressbookId);

List<AddressBookData> getFindByCity(String city);
	
AddressBookData createEmployeePayrollData(AddressBookDTO 
			
		addressBookDTO);
	
AddressBookData updateAddressBookData( int addressbookId, AddressBookDTO 
			
		addressBookDTO);

void deleteAddressBookData(int addressbookId);

}
