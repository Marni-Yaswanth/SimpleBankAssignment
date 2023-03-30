package com.Amit.BankAssignment;

public class BankAccount {

	int id;
	String name;
	int balance;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

	public BankAccount(int id, String name, int balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void Deposit(int amount)
	{
		
		balance += amount;
		this.setBalance(balance);
		System.out.println(balance);
		
	}
	
	public void WithDraw(int amount)
	{
		
			if (amount<=balance)
			{
				balance -= amount;
				this.setBalance(balance);
				System.out.println(balance);
			}
			else {
				System.out.println("invalid balance");
			}
			
		
		
		
		
	}
}
