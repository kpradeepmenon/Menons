package com.htc.Exercise6.main;

import java.util.Scanner;

import com.htc.Exercise6.entity.BankAccount;
import com.htc.Exercise6.entity.Bank;
import com.htc.Exercise6.entity.IBankServiceProvider;
import com.htc.Exercise6.entity.InsufficientFundException;
import com.htc.Exercise6.entity.InvalidAmountException;

public class BankAccountsImpl {

	public static void main(String[] args) throws InsufficientFundException, InvalidAmountException{
		
		Bank account = new Bank();
		
		int opt;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("\n\nPlease choose an option:");
			System.out.println("Enter 1 for checking an account");
			System.out.println("Enter 2 for getting the balance in an account");
			System.out.println("Enter 3 for depositing money in an account");
			System.out.println("Enter 4 for withdrawing money from an account");
			System.out.println("Enter 5 for transferring money between two accounts");
			System.out.println("Enter 0 to exit out");
			opt = s.nextInt();
				
			int acnum;
			BankAccount acc;
			switch (opt) {
			case 1:
				System.out.println("Please enter the account number");
				acnum = s.nextInt();
				acc = account.checkAccount(acnum);
				if (acc != null) {
					System.out.println(acc);
					break;
				} else {
					System.out.println("This account number doesnt exist");
				}
			case 2:
				System.out.println("Please enter the account number");
				acnum = s.nextInt();
				acc = account.checkAccount(acnum);
				if (acc != null) {
					System.out.println("The balance in account "+acnum+" is "+acc.getBalance());
					System.out.println("****************************************************");
					// break;
				} else {
					System.out.println("This account number doesnt exist");
				}
				break;
			case 3:
				System.out.println("Please enter the account number");
				acnum = s.nextInt();
				acc = account.checkAccount(acnum);
				if (acc != null) {
					System.out.println("Please enter the amount to deposit");
					Double amt = s.nextDouble();
					if (account.depositMoney(acc, amt)) {
						System.out.println("Deposit successful. The balance now is " + acc.getBalance());
						System.out.println("****************************************************");
						break;
					}
				} else {
					System.out.println("This account number doesnt exist");
				}

			case 4:
				System.out.println("Please enter the account number");
				acnum = s.nextInt();
				acc = account.checkAccount(acnum);
				if (acc != null) {
					System.out.println("Please enter the amount to withdraw");
					Double amt = s.nextDouble();
					try {
						boolean flag = account.withdrawMoney(acc, amt);
						System.out.println("Amount " + amt + " withdrawn. The balance now is " + acc.getBalance());
						System.out.println("****************************************************");
					}
					catch (InsufficientFundException e){
						System.out.println(e.getMessage());
					}
					
					/*if (account.withdrawMoney(acc, amt)) {
						System.out.println("Amount " + amt + " withdrawn. The balance now is " + acc.getBalance());
						System.out.println("****************************************************");
						break;
					}*/
				} 
				else {
					System.out.println("This account number doesnt exist");
				}

			case 5:
				System.out.println("Please enter the account number to transfer money from");
				acnum = s.nextInt();
				acc = account.checkAccount(acnum);
				if (acc != null) {
					System.out.println("Please enter the account number to transfer money to");
					int acnum2 = s.nextInt();
					BankAccount acc2 = account.checkAccount(acnum2);
					if (acc2 != null) {
						System.out.println("Please enter the amount to transfer");
						Double amt = s.nextDouble();
						if (account.transferMoney(acc, acc2, amt)) {
							System.out.println("Transfer complete");
							System.out.println("****************************************************");
							break;
						}
					} else {
						System.out.println("Account to transfer to doesnt exist");
						break;
					}

				} else {
					System.out.println("This account number doesnt exist");
				}

			}
		} while (opt != 0);
	}
}