package com.htc.Exercise6.entity;

public class BankAccount {
	private int bankAccountNum;
	private String accName;
	private Double balance;
	public static int lastAssignedNo = 0;
	
	public BankAccount(String accName, Double balance) {
		super();
		lastAssignedNo++;
		this.bankAccountNum = lastAssignedNo;
		this.accName = accName;
		this.balance = balance;
	}

	public int getAccNum() {
		return bankAccountNum;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public Double getBalance() {
		return balance;
	}
	
		public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [bankAccount=" + bankAccountNum + ", accName=" + accName + ", balance=" + balance + "]";
	}
	
	

}
