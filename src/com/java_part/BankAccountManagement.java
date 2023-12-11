/*
 * Assignment 4: Bank Account Management
Develop a BankAccount class with attributes:
accountNumber (String)
accountHolder (String)
balance (double)
Implement methods for deposit, withdrawal, and displaying the account details. 
Create objects of this class and simulate transactions.
 */



package com.java_part;
class BankAccount
{
	String accountNumber;
	String accountholder;
	double balance;
	public BankAccount(String accountNumber, String accountholder, double balance) {
		this.accountNumber = accountNumber;
		this.accountholder = accountholder;
		this.balance = balance;
	}
	void deposit(double money)
	{
		balance=balance+money;
		System.out.println("updated balance: "+balance);
	}
	void withdrawal(double money)
	{
		balance=balance-money;
		System.out.println("remaining balance: "+balance);
	}
	void displayAccountdetails() {
		System.out.println("---------------------");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+accountholder);
		System.out.println("Account Balance: "+balance);
		System.out.println("---------------------");
	}
}
public class BankAccountManagement {

	public static void main(String[] args) {
		BankAccount obj=new BankAccount("ABCD","Sathwik",100000);
		obj.displayAccountdetails();
		obj.deposit(50000);
		obj.withdrawal(25000);
		obj.displayAccountdetails();

	}

}
