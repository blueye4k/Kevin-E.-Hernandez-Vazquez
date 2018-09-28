// By: Kevin E. Hernandez
// Date: 2/11/2018
/*
 * This program inputs three integers from the user and displays 
 * the sum, average, product, smallest and largest of the numbers. [Note: The 
 * calculation of the average in this exercise should result in an integer 
 * representation of the average. So if the sum of the values is 7, the average 
 * should be 2, not 2.3333….]
 */

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int x, average, product = 1, sum = 0;
		int[] num= {0,0,0};
		
		for(int i=0; i<3; i++) {
			System.out.printf("Enter integer #%d: ",i+1);
			x = number.nextInt();
			num[i] = x;
			sum += x;
			product *= x;
		}
		System.out.printf("For the numbers %d, %d and %d\n", num[0],num[1],num[2]);
		
		int largest = num[0], smallest = num[0];
		
		for(int i=1; i<3; i++) {
			if (largest < num[i]) {
				largest = num[i];
			}
			
			if (smallest > num[i]) {
				smallest = num[i];
			}
		}
		average = sum/num.length;
		System.out.printf("Largest is %d\nSmallest is %d\nSum is %d\nProduct is %d\nAverage is %d\n", largest, smallest,sum,product,average);
	}

}
