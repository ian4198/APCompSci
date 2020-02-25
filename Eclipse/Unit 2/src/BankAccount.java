

public class BankAccount {

	
	private double balance;
	
	public BankAccount()
	{
		balance = 0;
	}
	BankAccount(double newbalance)
	{
		balance = newbalance;
	}
	//methods
	public void deposit(double adddeposit)
	{
		balance = balance + adddeposit;
	}
	public void withdrawal(double subwithdrawal)
	{
		balance = balance - subwithdrawal;
	}
	double findbalance()
	{
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
}
