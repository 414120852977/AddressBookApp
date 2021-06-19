package com.bridgelabz.addressbookapp.controller;

public class AddressBookDTO {
	private String message;
	private Object data;
	public AddressBookDTO(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "AddressBookDTO [message=" + message + ", data=" + data + "]";
	}
	
	
}
