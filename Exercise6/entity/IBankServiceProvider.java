package com.htc.Exercise6.entity;

public interface IBankServiceProvider {
	
	public BankAccount checkAccount(int accountNo);
	
	public double getBalance(BankAccount account);
	
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException;
	
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException, InvalidAmountException;
	
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundException, InvalidAmountException;
	

}
