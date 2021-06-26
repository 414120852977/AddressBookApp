package com.bridgelabz.addressbookapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridgelabz.addressbookapp.model.AddressBookData;


public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer>{
	@Query(value = "select * from address_book, addressbook_city where address_bookid = id and city =?1",nativeQuery = true)
	List<AddressBookData> findByCity(String city);
}
