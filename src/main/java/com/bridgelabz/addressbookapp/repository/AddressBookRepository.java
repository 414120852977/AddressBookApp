package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface AddressBookRepository  extends CrudRepository<AddressBookData, Integer>{

}
