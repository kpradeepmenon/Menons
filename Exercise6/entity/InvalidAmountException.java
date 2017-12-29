package com.htc.Exercise6.entity;

public class InvalidAmountException extends Exception {

	String msg;
	public InvalidAmountException () {
		this.msg = "Amount entered is invalid"; 
	}
	
	@Override
	public String toString() {
		return msg;
	}
	
}