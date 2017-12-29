package com.htc.Exercise6.entity;

public class InsufficientFundException extends Exception {

	String msg;
	public InsufficientFundException() {
		this.msg = "Insufficient balance in account"; 
	}
	
	@Override
	public String toString() {
		return msg;
	}
	
}
