package com.bridgelabz.addressbookapp.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bridgelabz.addressbookapp.dto.ResponseDTO;

@ControllerAdvice
public class AddressBookExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	
	public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException( MethodArgumentNotValidException exception) {
		List<ObjectError> errList = exception.getBindingResult().getAllErrors();
		
		List<String> errMesg = errList.stream()
				.map(objError -> objError.getDefaultMessage())
				.collect(Collectors.toList());
		
		ResponseDTO responseDTO = new ResponseDTO("Exception while processing request",errMesg);
	
	return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
	}
}

