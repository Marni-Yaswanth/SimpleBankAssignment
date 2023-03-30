package com.Amit.BankAssignment;

public class CurrentAccount extends BankAccount {
	
	int Odl = balance/10;
	int od = 0;
	int c=0;

	public CurrentAccount(int id, String name, int balance) {
		super(id, name, balance);
		// TODO Auto-generated constructor stub
	}

	public int getOdl() {
		return Odl;
	}

	public void setOdl(int odl) {
		Odl = odl;
	}

	public int getOd() {
		return od;
	}

	public void setOd(int od) {
		this.od = od;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	@Override
	public void Deposit(int amount)
	{
		if(od==0)
		{
			balance = getBalance();
			balance += amount;
			setBalance(balance);
			
			
		}
		else if (amount<(od))
		{
			
			od=od+amount;
			//System.out.println("over draft is : "+od);
			//c+=amount;
			//System.out.println("balance is "+balance);
			
			
		}
		else if(amount>od){
			int finalamt=amount-od;
			this.balance=finalamt;
			this.od=0;
			
		}
		
		System.out.println("balance is : "+balance+" od is:"+od);
		
	}
	@Override
	public void WithDraw(int amount)
	{
		while(Odl>0)
		{
			if(amount<=balance)
			{
				balance -= amount;
				od=0;
				setBalance(balance);
				System.out.println("balance is : "+ balance);
				
			}
			else if(amount>balance)
			{
//				balance-=amount;
				
				//System.out.println("balance is : "+balance);
				System.out.println("odl is : "+Odl);
				System.out.println("withdrawing Rs."+amount);
				System.out.println("balance is : "+ balance);
				
				od=amount-balance;
				setOd(od);
				if (Odl<od)
				{
					System.out.println("you can only take "+(balance+Odl));
					
					return;
				}
				else {
					System.out.println("over draft is : "+(-od));
				}
			}
			break;
			
		}
	}
	
}

	
	
	

