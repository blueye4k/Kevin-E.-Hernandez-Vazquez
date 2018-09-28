package test1;

// By: Kevin E. Hernandez Vazquez
// Date: 2/14/2018
/*
 * This program takes a 1x8 vector of integers. With two methods; the first method 
 * finds the maximum value in the vector. 
 * The other method counts the even numbers in vector.
 */

public class Exercise02 {
	
	public static int[] numbers = {20,22,12,4,8,40,26,32};
	
	// Method to find the maximum number in the array
	public int maximum() {
		int maximum = 0;
		for(int i=0;i<numbers.length;i++) {if(maximum<numbers[i]) {maximum = numbers[i];}}
		return maximum;
	}
	
	// Method to count all the even numbers in the array
	public int evenNumbers() {
		int count = 0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Exercise02 x = new Exercise02();
		
		String vector=" ";
		
		for(int n:numbers) {vector += Integer.toString(n)+" ";} 
		
		int maximum = x.maximum(),
			evenNumbers = x.evenNumbers();
		
		System.out.printf("Vector[1x8]: [%s]\nMaximum: %d\nEvenNumbers: %d",vector,maximum,evenNumbers);

	}

}
