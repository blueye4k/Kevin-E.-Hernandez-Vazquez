#include <iostream>
#include <iomanip>
using namespace std;

// Author: Kevin E. Hernandez Vazquez
// Date: December 19, 2017

// This program contains two sub-programs that calculates two different things.
// The first thing is the rainfall in inches for an x quantity of months. And the
// second one will calculates the price of the chosen drink from the displayed menu.

// Function Prototypes
char getOption();
void menu();
void showMenu();
void subMothlyRainfall();
void subHotBeverage();

// Main Function
int main()
{
  char chrOption;
  do {
    showMenu();

    chrOption = getOption();

    switch (chrOption) {
      case 'a': case 'A':
        subMothlyRainfall();
        break;
      case 'b': case 'B':
        subHotBeverage();
        break;
      case 'q': case 'Q':
        cout << " Please come again\n";
        break;
      default:
        cout << "Invalid input\n";
    }
  } while (chrOption != 'Q');
  cout << "\n You Quit the main program! \n" << endl;
  cout << " FELIZ NAVIDAD!!!!!" << endl;
  return 0;
}

// This function ask the user for an option, reads a character and return it.
char getOption()
{
  char chrOption;
  cout << "Please enter your option: ";
  cin >> chrOption;
  return chrOption;
}

// This function shows a menu for the user.
void showMenu()
{
  cout << "\n*************** MENU ***********************\n";
  cout << "Please select the apropriate option:\n";
  cout << "A. Run Monthly Rainfall sub-program.\n";
  cout << "B. Run Hot Beverage sub-program.\n";
  cout << "Q. Quit the main program.\n";
  cout << "**************************************\n";
}

// This function illustrates the use of a sentinel in a while loop.
// The user is asked for monthly rainfall totals until a sentinel
// value of one is entered. Then the total rainfall is displayed.
void subMothlyRainfall()
{
  int month = 1;
  float total = 0, rain;
  cout << "\nEnter the total rainfall for month " << month << endl;
  cout << "Enter -1 when you are finished: ";
  cin >> rain;

  while (rain != -1)
  {
    total += rain;
    month++;
    cout << "\nEnter the total rainfall in inches for month " << month << endl;
    cout << "Enter -1 when you are finished: ";
    cin >> rain;
  }
  if (month == 1)
  {
    cout << "No data has been entered\n";
  }
  else {
    cout << "\nThe total rainfall for the " << (month - 1);
    cout << " months is " << total << " inches." << endl;
  }
}

// This function displays a hot beverage menu and prompts the user to
// make a selection. A switch statement determines which item the user
// has chosen. A do-while loop repeats until the user selects item E
// from the menu.
void subHotBeverage()
{
  int number;
  float cost;
  char beverage;

  bool validBeverage;
  cout << fixed << showpoint << setprecision(2);
  do {
    cout << "\n\n";
    cout << "Hot Beverage Menu\n\n";
    cout << "A: Coffee $1.00\n";
    cout << "B: Tea $1.75\n";
    cout << "C: Hot Chocolate $1.25\n";
    cout << "D: Cappuccino $2.50\n\n\n";
    cout << "Enter the beverage A, B, C or D you desire\n";
    cout << "Enter E to exit the program\n\n";

    cout << "Please chose an option: ";
    cin >> beverage;
    cout << endl;

    switch (beverage) {
      case 'a': case 'A':
      case 'b': case 'B':
      case 'c': case 'C':
      case 'd': case 'D':
        validBeverage = true;
        break;
      default:
        validBeverage = false;
    }

    if (validBeverage) {
      cout << "How many cups would you like? ";
      cin >> number;
    }

    switch (beverage)
    {
      case 'a': case 'A':
        cost = number * 1.0;
        cout << "The total cost is $" << cost << endl;
        break;
      case 'b': case 'B':
        cost = number * 1.75;
        cout << "The total cost is $" << cost << endl;
        break;
      case 'c': case 'C':
        cost = number * 1.25;
        cout << "The total cost is $" << cost << endl;
        break;
      case 'd': case 'D':
        cost = number * 2.5;
        cout << "The total cost is $" << cost << endl;
        break;
      case 'e': case 'E':
        cout << " Please come again" << endl;

        break;
      default:
        cout << " Invalid Option\n";
        cout << " Try again please\n";
    }
  } while (beverage != 'e' || beverage != 'E');
}
