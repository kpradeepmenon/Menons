package com.htc.Exercise6.entity;

import java.util.Scanner;

import com.htc.Exercise6.entity.BankAccount;
import com.htc.Exercise6.entity.IBankServiceProvider;

public class Bank implements IBankServiceProvider
{
			
	BankAccount[] bankAccount = new BankAccount[5] ; {
	
	bankAccount[0] = new BankAccount("Abc",1000.00);
	bankAccount[1] = new BankAccount("Def",2000.00);
	bankAccount[2] = new BankAccount("Ghi",3000.00);
	bankAccount[3] = new BankAccount("Jkl",5000.00);
	bankAccount[4] = new BankAccount("Mno",1000.00);
	}
	
	@Override
	public BankAccount checkAccount(int accountNo) {
		// TODO Auto-generated method stub
		for (BankAccount acc : bankAccount)
		{
			if (acc.getAccNum() == accountNo)
				return acc;
		}
		
		return null;
	}

	@Override
	public double getBalance(BankAccount account) {
		Double bal = account.getBalance();
		return bal;
	}

	@Override
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException();
		}
		else {
			Double bal = account.getBalance() + amount;
			account.setBalance(bal);
			return true;
		}
	}

	
	@Override
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException, InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException();
		}
		else {
			Double bal = getBalance(account) - amount;
			if (bal < 0) {
				throw new InsufficientFundException();
			} else {
				account.setBalance(bal);
				return true;
			}
		}
	}

	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundException, InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException();
		}
		else {
			Double bal = getBalance(fromAccount) - amount;
			if (bal < 0) {
				throw new InsufficientFundException();
			} else {
				Double newbal = getBalance(toAccount) + amount;
				toAccount.setBalance(newbal);
				return true;
			}
		}
	}

}
