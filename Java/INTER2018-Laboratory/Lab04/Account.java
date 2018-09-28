package feb20;

public class Account {
	
	public static int balance;
	
	public Account(int a) {
		balance=a;
	}
	
	double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		Account b1 = new Account(30);
		System.out.printf("Balance #1: $%.2f\n", b1.getBalance());
		
		Account b2 = new Account(25);
		System.out.printf("Balance #2: $%.2f", b2.getBalance());

	}

}
