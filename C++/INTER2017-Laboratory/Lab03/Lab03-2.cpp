// This program will read in the quantity of a particular item and its price.
// It will then print out the total price.
// The input will come from the keyboard and the output will go to
// the screen

// By: Raynier Santana
//     Kevin Hernandez

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	int quantity;
	float itemPrice,
		  totalBill;
		 
	cout << setprecision(2) << showpoint;
	
	cout << "Please input the number of items bought:" << endl;
	cin >> quantity;
	
	cout << "Please input the price of each item:" << endl;
	cin >> itemPrice;
	
	totalBill = quantity * itemPrice;
	
	cout << "The total bill is $" << totalBill;
	
	return 0;
}

/* < Question #1: >
 * 		With the 'fixed' function the result of 'totalBill' results in 
 * 		a float number with the decimal point after the last number in 
 * 		the result. And the number of decimal numbers after the decimal 
 *		point is given by the 'setprecision()' function.
 * 		
 * 		For example:  
 * 			if (totalBill == 900)
 * 				cout << "900.000 --> point after the int number";
 * 
 * < Question #2: >
 * 		Without the 'fixed' function the result of 'totalBill' results
 * 		in a float number in scientific notation.
 * 
 * 		For example:  
 * 			if (totalBill == 900)
 * 				cout << "9.0e+02 --> converted to scientific notation";
 * 		 
 * < Conclusion >
 *		The 'fixed' function writes floating-point values in fixed-point
 *	  	notation. 
 */
