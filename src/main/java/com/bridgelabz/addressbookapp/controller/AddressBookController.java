package com.bridgelabz.addressbookapp.controller;

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

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@RequestMapping(value = {"","/", "/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(1, new AddressBookDTO("Pankaj","salve","sashti","jalna","maharashtra",431212,"ashok@gmail.com",4545454));
		ResponseDTO resDTO = new ResponseDTO("Get Call Success",addressbookData );
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	
	}
	@GetMapping("/get/{addressbookId}")
	public ResponseEntity<ResponseDTO> getAddressBookDataData(@PathVariable("addressbookId") int addressbookId) {
		
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(1, new AddressBookDTO("Pankaj","salve","sashti","jalna","maharashtra",431212,"ashok@gmail.com",4545454));
		ResponseDTO resDTO = new ResponseDTO("Get Call for id successfull",addressbookData );
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(
								@RequestBody AddressBookDTO addressBookDTO ) {
		
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(1,  addressBookDTO);
		ResponseDTO resDTO = new ResponseDTO("created Employee Payroll Data  Successfully",addressbookData );
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressBookData(
			@RequestBody AddressBookDTO addressBookDTO ) {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(1,  addressBookDTO);
		ResponseDTO resDTO = new ResponseDTO("updated Employee Payroll Data  Successfully",addressbookData );
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
} 
	@DeleteMapping("/delete/{addressbookId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(
			@PathVariable("addressbookId") int addressbookId) {
		ResponseDTO resDTO = new ResponseDTO("deleted  Successfully","Deleted Id:" +addressbookId );
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
}  

}
