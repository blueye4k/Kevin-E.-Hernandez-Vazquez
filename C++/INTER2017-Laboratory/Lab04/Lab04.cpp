#include <iostream>
#include <iomanip>
using namespace std;

/***************************
 * By: Raynier Santana     *
 *     Kevin E. Hernandez  *
 * 						   *
 * Date: November 21, 2017 *
 ***************************/

/******************PROGRAM-DESCRIPTION**********************
 * This program prompts the user for their quarterly water *
 * bill for the last four quarters and calculates their a- *
 * verage monthly water bill.				               *
 ***********************************************************/

// Function Prototype
char getOption();
void showMenu();
void Switch(char);

// Universal variables
const int quarters = 4;
int i;
float average,		// Total sum divide by the quater months.
	  waterBill, 	// Single water bill for each quarter month.
	  totalSum = 0;	// Total sum init in zero to collect waterBills.
	  
// Main Function
int main()
{
	char chrOption;
	
	showMenu();
	chrOption = getOption();
	Switch(chrOption);
	
	return 0;
}

// Function to show the options that are allowed to input.
void showMenu()
{
	cout << "\n*************** MENU *****************\n"
		 << "Please select the apropriate option:\n"
		 << "A. Run Water Bill program.\n"
		 << "Q. Quit the main program.\n"
		 << "**************************************\n";
}	

// Function to return selected option.
char getOption()
{
	char chrOption;
	cout << "Please enter your option: \n";
	cin >> chrOption;
	
	return chrOption;
}

// Function to classify the selected option.
void Switch(char chrOption)
{
	switch (chrOption)
	{
		case 'a': case 'A':
			cout << endl;
			for (i = 1; i <= quarters; i++)
			{
				cout << "Please input your water bill for quarter " 
					 << i << ":\n";
				cin >> waterBill;
				totalSum += waterBill;
			}
			break;
		case 'q': case 'Q':
			cout << "Program Terminated";
			break;
		default:
			cout << "Invalid Option";
	}
	cout << fixed << setprecision(2);
	average = (totalSum/(i*3));
	
	if (average > 75)
		cout << "Your average monthly bill is $" << average 
			 << ". You are using excessive amounts of water";
	else if (average >= 25 && average <= 75)
		cout << "Your average monthly bill is $" << average 
			 << ". You are using a typical amount of water";
	else if (average < 25)
		cout << "Your average monthly bill is $" << average 
			 << ". You are using less amount of water";
}
