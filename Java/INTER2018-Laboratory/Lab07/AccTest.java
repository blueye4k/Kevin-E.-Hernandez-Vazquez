package feb20;

import java.util.Scanner;

public class AccTest {

	public static void main(String[] args) {
		boolean done = false;
		
		Scanner x = new Scanner(System.in);
		
		// Checking Account
		Checking a = new Checking(1234);
		
		// Savings Account
		Saving b = new Saving(4321);
		
		
		
		while(!done) {
			// MENU
			System.out.println("\n|*|*|*|*|MENU|*|*|*|*|");
			System.out.println("1. Saving");
			System.out.println("2. Checking");
			System.out.println("3. END PROGRAM");
			System.out.print("Choose Option: ");
			
			int option = x.nextInt();
			switch(option) {
			case 1: // Saving
				boolean done1 = false;
				while(!done1) {
					System.out.println("\n|*|*|*|*|Saving|*|*|*|*|");
					System.out.printf("1. %s\n","Deposit");
					System.out.printf("2. %s\n","Withdraw");
					System.out.printf("3. %s\n","Get Balance & Account Number");
					System.out.println("4. Prediction");
					System.out.println("5. << DONE <<");
					System.out.print("Choose Option: ");
					option = x.nextInt();
					switch(option) {
					case 1:
						System.out.print("Please enter the ammount to deposit: $");
						double ammount = x.nextDouble();
						b.deposit(ammount);
						break;
					case 2:
						System.out.print("Please enter the ammount to withdraw: $");
						double ammount1 = x.nextDouble();
						if (b.getBalance()-ammount1>0) {
							b.withdraw(ammount1);
						} else {
							System.err.println("Account.withdraw(...): "+"cannot withdraw negative amount.\n");
						}
						break;
					case 3:
						System.out.printf("\nACCOUNT NUMBER: %d", b.getAccountNumber());
						System.out.printf("\nBALANCE: %.2f\n", b.getBalance());
						break;
					case 4:
						System.out.println("Please enter the number of months: ");
						int months = x.nextInt();
						System.out.printf("In %d months you will have $%.2f in your account...\n", months, a.prediction(months, b.interest));
						break;
					case 5:
						done1 = true;
					}
				}
				break;
			case 2: // Checking
				boolean done2 = false;
				while(!done2) {
					System.out.println("\n|*|*|*|*|Checking|*|*|*|*|");
					System.out.printf("1. %s\n","Deposit");
					System.out.printf("2. %s\n","Withdraw");
					System.out.printf("3. %s\n","Get Balance & Account Number");
					System.out.println("4. Prediction");
					System.out.println("5. << DONE <<");
					System.out.print("Choose Option: ");
					option = x.nextInt();
					switch(option) {
					case 1:
						System.out.print("Please enter the ammount to deposit: $");
						double ammount = x.nextDouble();
						a.deposit(ammount);
						break;
					case 2:
						System.out.print("Please enter the ammount to withdraw: $");
						double ammount1 = x.nextDouble();
						a.detectOverdraft(a.overdraft, ammount1);
						break;
					case 3:
						System.out.printf("\nACCOUNT NUMBER: %d", a.getAccountNumber());
						System.out.printf("\nBALANCE: %.2f\n", a.getBalance());
						break;
					case 4:
						System.out.println("Please enter the number of months: ");
						int months = x.nextInt();
						System.out.println("Please enter account interest rate: ");
						double interest = x.nextDouble();
						System.out.printf("In %d months you will have $%.2f in your account...\n", months, a.prediction(months, interest));
						break;
					case 5:
						done2 = true;
					}
				}
				break;
	
			case 3: // Quit
				System.out.println("--Program ended--");
				done = true;
			}
		

	}

}
}
