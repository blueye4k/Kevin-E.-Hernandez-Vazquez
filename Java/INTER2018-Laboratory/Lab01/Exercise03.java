// By: Kevin E. Hernandez
// Date: 2/11/2018
/*
 * This program prompts for and reads in the sales for each of 5 vendor in a company. 
 * It then prints out the id and amount of sales for each vendor and the total sales.
 * It computes and prints the average sale.
 * Find and prints the maximum sale. Prints both the id of the vendor with the min sale and the amount of the sale.
 * Asks the user to enter a value. Then print the id of each vendor who exceeded that amount, and the amount of their sales. 
 * Also print the total number of vendor whose sales exceeded the value entered.
 */

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int vendors;
		
		System.out.print("Enter how many vendors are they: ");
		vendors = x.nextInt();
		int[] money = new int[vendors];
		
		for(int i=0; i<vendors; i++) {
			System.out.printf("Enter sales of vendor #%d: ", i+1);
			money[i] = x.nextInt();
		}
		
		int vmax=0, 
			vmin=0,
			min=money[0],
			max=money[0],
			sum=0,
			average,
			value,
			total=0;
		
		for(int i=1; i<money.length; i++) {
			if (min > money[i]) {
				min = money[i];
				vmin = i+1;
				}
			else {
				if (max<money[i]) {
					max = money[i];
					vmax = i+1;	
				}
			}
			if(money[0]==max) {vmax=1;}
			if(money[0]==min) {vmin=1;}
		}
		for(int val:money) {sum+=val;}
		average = (sum/money.length);
		
		System.out.printf("Vendor %d had the lowest sale with $%d\n", vmin, min);
		System.out.printf("Vendor %d had the highest sale with $%d\n", vmax,max);
		System.out.printf("-------\nSUM: %d\nAVERAGE: %d\n-------\n",sum, average);
		
		System.out.print("Please enter a value: ");
		value = x.nextInt();
		
		for(int i=0;i<money.length;i++) {
			if(money[i]>value) {
				System.out.printf("\nVendor #%d exceeded the value.", i+1);
				total+=1;
			}
		}
		System.out.printf("\nFor a total of %d Vendors who exceeded the value.", total);
	}

}
