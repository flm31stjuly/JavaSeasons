package sep15th;

public class Bank {
	
	
	private double balance = 10000;
	
	//getters 
	public double getBalance(int pin)
	{
		//validation 
		if(pin == 3421)
		{
			return balance;
		}
		else
		{
			System.out.println("Invalid pin...");
			return 0.0;
		}
	}
	
	//setter 
	
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}

}
