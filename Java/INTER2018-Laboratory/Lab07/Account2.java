package feb20;

public class Account2
{
	private double bal; //The current balance
	private int accnum; //The account number

	public Account2(int a)
	{
		bal=0.0;
		accnum=a;
	}
	
	public void deposit(double sum)
	{
		if (sum>0) {
			bal+=sum;
		    System.out.println("Ammount deposit succesful...");}
		else
			System.err.println("Account.deposit(...): "+"cannot deposit negative amount.");
	}
	
	public void withdraw(double sum)
	{
		if (sum>0) {
			bal-=sum;
		    System.out.println("Ammount withdraw succesful...");
		}
		else
			System.err.println("Account.withdraw(...): "+"cannot withdraw negative amount.");
	}
	
	public double getBalance()
	{
		return bal;
	}
	
	public int getAccountNumber()
	{
		return accnum;
	}
	
	public String toString()
	{
		return "Acc " + accnum + ": " + "balance = " + bal;
	}
	
	public void detectOverdraft(int overdraft, double sum) {
		if ((bal-sum)<0) {
			System.out.println("OVERDRAFT DETECTED");
			if ((bal-sum)<overdraft) {
				System.err.println("Cannot withdraw more than the overdraft limit...");
			} else {
				bal-=sum;
			}	
		} else {withdraw(sum);}
	}
	
	// Simple interest
	public double prediction(int months, double interest) {
		return (months/12)*interest*getBalance()+getBalance();
	}
}
