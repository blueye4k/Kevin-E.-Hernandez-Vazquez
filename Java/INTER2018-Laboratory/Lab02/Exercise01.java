package test1;

// By: Kevin E. Hernandez Vazquez
// Date: 2/14/2018
/*
 * This program uses a method in java that given a vector of size 6, counts the
 * numbers of 2’s that there is in the vector and prints the result.
 */

import java.util.*;

public class Exercise01 {
	public int count=0;                          // Variable to count the 2's
	public static String numbers=" ";			 // Array-to-String variable
	public static int[] vector = new int[6];     // Vector of size-6
			   
	// Method to find all the 2's in the string
	public void result(String numbers) {
		for(int i=0;i<numbers.length();i++) {if(numbers.charAt(i)=='2') {count++;}}
		System.out.printf("There are %d 2's in [%s]",count,numbers);
	}

	// Main Class
	public static void main(String[] args) {
		
		Exercise01 r = new Exercise01();     // Brings the result() method
		Scanner x = new Scanner(System.in);  // Gets input from user
		
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Enter number #%d: ",i+1);
			vector[i]=x.nextInt();
		}
		for(int n:vector) {numbers += Integer.toString(n)+" ";}  // Converts Array-to-String
		r.result(numbers); // Executes the result() method
		}
}
