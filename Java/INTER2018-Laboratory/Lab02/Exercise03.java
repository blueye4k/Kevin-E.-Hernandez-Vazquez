package test1;

// By: Kevin E. Hernandez Vazquez
// Date: 2/14/2018
/*
 * This application inputs 5 numbers, each between 10 and 100, inclusive. 
 * As each number is read, it displays only if it’s not a duplicate of a 
 * number already read. Displays the complete set of unique values input 
 * after the user enters each new value.
 */

import java.util.*;

public class Exercise03 {
	
	public static int[] numbers = new int[5];
	
	public static boolean investigar(int n) {
		for(int val:numbers) {
			if(val==n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		String list="";
		
		for(int i=0;i<numbers.length;i++) {
			System.out.printf("Enter number #%d: ",i+1);
			x = input.nextInt();
			if(x>10 && x<100) {
				if(investigar(x)) {
					System.out.printf("%d has already been entered\n",x);
					System.out.printf("%s\n",list);
				} else {
					numbers[i]=x;
					list += Integer.toString(numbers[i])+" ";
					System.out.printf("%s\n",list);
				}
			} else {
				i--;
			}
		}
	}
}
