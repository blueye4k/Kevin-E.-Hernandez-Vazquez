// This program will input the value of two sides of a right triangle and then
// determine the size of the hypotenuse.

// By: Raynier Santana
//     Kevin Hernandez

#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

void hypotenuse(float, float);

int main()
{
	float a, b;
	
	cout << "Please input the value of the two sides: " << endl;
	cin >> a >> b;
	
	cout << "The sides of the right triangle are " << a << " and " << b << endl;
	cout << "The hypotenuse is: " << setw(9);
	hypotenuse(a,b);
	
	return 0;
}

void hypotenuse(float a, float b)	// Hypotenuse function
{
	float hyp;	
	
	// Hypotenuse variable assigning the formula
	hyp = sqrt(pow(a,2) + pow(b,2));
	
	cout << setprecision(2) << fixed << hyp;
}
