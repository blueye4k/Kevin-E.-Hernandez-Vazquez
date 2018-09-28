// By: Kevin Hernandez Vazquez
/* This program asks the user how many tickes were sold in three classes
 * and returns the total gain.
 */
 
#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

int main()
{
	double _class[3] = {15, 12, 9};         // Prices
	string classType[3] = {"A", "B", "C"};  // Class type
	int tickets;
	double total = 0;

	for (int index = 0; index < 3; index++)
	{
		cout << "How many tickets were sold in class " << classType[index] << "? ";
		cin >> tickets;
		total += (tickets * _class[index]);
	}

	cout << fixed << showpoint << setprecision(2) << endl;
	cout << "The total is: $" << total;

	return 0;
}
