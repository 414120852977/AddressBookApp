package com.bridgelabz.addressbookapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping(value = {"","/", "/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		List<AddressBookData> addressBookDataList = null;
		addressBookDataList = addressBookService.getAddressBookData();
		ResponseDTO resDTO = new ResponseDTO("Get Call Success",addressBookDataList );
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	
	}
	@GetMapping("/get/{addressbookId}")
	public ResponseEntity<ResponseDTO> getAddressBookDataData(@PathVariable("addressbookId") int addressbookId) {
		
		AddressBookData addressBookData = addressBookService.getAddressBookDataById(addressbookId);
		ResponseDTO resDTO = new ResponseDTO("Get Call for id successfull",addressBookData );
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(
								 @Valid @RequestBody AddressBookDTO addressBookDTO ) {
		
		AddressBookData addressbookData = addressBookService.createEmployeePayrollData(addressBookDTO);
		ResponseDTO resDTO = new ResponseDTO("created Employee Payroll Data  Successfully",addressbookData );
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressBookData(
			 @Valid @RequestBody AddressBookDTO addressBookDTO ) {
		AddressBookData addressbookData = addressBookService.updateAddressBookData(1, addressBookDTO);
		ResponseDTO resDTO = new ResponseDTO("updated Employee Payroll Data  Successfully",addressbookData );
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
} 
	@DeleteMapping("/delete/{addressbookId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(
			@PathVariable("addressbookId") int addressbookId) {
		addressBookService.deleteAddressBookData(addressbookId);
		ResponseDTO resDTO = new ResponseDTO("deleted  Successfully","Deleted Id:" +addressbookId );
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
}  

}
