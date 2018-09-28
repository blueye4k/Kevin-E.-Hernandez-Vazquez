package test1;

// By: Kevin E. Hernandez Vazquez
// Date: 2/14/2018
/*
 * This program receives a value of an even positive integer “n” 
 * and calculates and returns the product of the even integers 
 * from 1 to n. Then, if the result is less than 5, prints “menor que 5”, 
 * otherwise prints “mayor que 5”.
 */

import java.util.*;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int n;
		int product = 1;
		
		System.out.print("Enter an even positive number(n): ");
		n = input.nextInt();
		
		for(int i=1;i<=n;i++) {if(i%2==0) {product*=i;}}
		if(product>5) {
			System.out.printf("RESULT: %d\nEs mayor que 5",product);
		} else {
			System.out.printf("RESULT: %d\nEs menor que 5", product);
		}
	}
}
