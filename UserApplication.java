package com.Amit.BankAssignment;

public class UserApplication {

	public static void main(String[] args) {

		
		BankAccount bankAccount = new CurrentAccount(123, "hello", 10000);
	bankAccount.Deposit(1000);
		bankAccount.WithDraw(10500);
		bankAccount.WithDraw(500);
		bankAccount.WithDraw(500);
		bankAccount.Deposit(1000);
		
		
		
		
		
		
		
	}

}
