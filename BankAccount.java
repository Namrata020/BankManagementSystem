package com.code;

public class BankAccount {
	private int acctNo;
	private String IFSC;
	private String customerName;
	private AcType acctType;
	private double balance;
	
	public BankAccount(int acctNo,String IFSC,String customerName,AcType acctType,double balance) {
		this.acctNo=acctNo;
		this.IFSC=IFSC;
		this.customerName=customerName;
		this.acctType=acctType;
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", IFSC=" + IFSC + ", customerName=" + customerName + ", acctType="
				+ acctType + ", balance=" + balance + "]";
	}
	
	//Overriding equals
	@Override
	public boolean equals(Object anotherObject) {
		System.out.println("IN ACCT'S EQUALS");
		if(anotherObject instanceof BankAccount)
		return this.acctNo==((BankAccount)anotherObject).acctNo;
		return false;
	}
	
	
	
}
