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

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@RequestMapping(value = {"","/", "/get"})
	public ResponseEntity<String> getAddressBookData() {
		return new ResponseEntity<String>("Get  Success", HttpStatus.OK);
	}
	@GetMapping("/get/{addressbookId}")
	public ResponseEntity<String> getAddressBookDataData(@PathVariable("addressbookId") int addressbookId) {
		return new ResponseEntity<String>("Get call success for id:"+addressbookId, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addAddressBookData(
								@RequestBody AddressBookDTO addressBookDTO ) {
		return new ResponseEntity<String>("Created Employee Payroll Data for:"+addressBookDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateAddressBookData(
			@RequestBody AddressBookDTO addressBookDTO ) {
			return new ResponseEntity<String>("Updated Employee Payroll Data for:"+addressBookDTO, HttpStatus.OK);
} 
	@DeleteMapping("/delete/{addressbookId}")
	public ResponseEntity<String> deleteAddressBookData(
			@PathVariable("addressbookId") int addressbookId) {
			return new ResponseEntity<String>("Delete Call Success for id:"+addressbookId, HttpStatus.OK);
}  

}
