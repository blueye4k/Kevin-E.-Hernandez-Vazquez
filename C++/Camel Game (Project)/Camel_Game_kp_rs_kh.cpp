// This program is based on the game "Camel"
//
/* The idea for Camel originally came from the Heath Users Group and was published
 * in More BASIC Computer Games in 1979. The idea is to ride your camel across the
 * desert while being chased. You need to manage your thirst, how tired the camel is,
 * and how far ahead of the native5s you are.
 */
// By: Kevin Hernandez Vazquez

#include <iostream>
#include <cmath>
#include <cstdlib>
#include <cstdio>
#include <ctime>
using namespace std;

// Function Prototypes
void drawing();                         // Drawing of a Camel walking in the desert
void clearScreen();                     // Clears the screen when you hit [Enter]
void intro();                           // Introduction of the game, what to do
void menu();                            // Menu with the options to be chosen
void status(int, int, int);             // Show status of the player's
void oasis(int &, int, int &, int &);   // Find oasis randomly
void dead();                            // Drawing that shows a skull when the player loses
void win();                             // Animation for when the player wins
void tryAgain();                        // Option to try again either the player lose or wins

int main()
{
  // Variables of the game
  bool done = 0;                        // Variable done to keep running the game while is false
  char option;                          // Option that the player enters form the menu
  int miles_traveled = 0,               // Miles traveled through the desert by the player
      thirst = 0,                       // Thirst of Indiana Jones
      camel_tiredness = 0,              // Tiredness of the camel
      natives_distance = -20,           // Distance of the natives are behind Indina Jones
      canteen_drinks = 2,               // Drinks in the canteen starting with 2
      miles;                            // Random miles traveled by Indiana Jones every time it moves

  // Loop to run the game until done is true
  while (!done)
  {
    unsigned seed = time(0);            // Generates the time since the program starts

    drawing();
    intro();
    menu();

    cin >> option;
    srand(seed);                        // Generates a different random number everytime it executes

    // Switch that executes a case depending on the option chosen
    switch (option) {
      case 'A': case 'a':           // Option A: Drink form the canteen
        if (canteen_drinks != 0)
        {
          cout << "\n\t\t(^) Drinking from the canteen...\n\n";
          natives_distance += (rand() % (14 - 7 +1)) + 7;
          canteen_drinks --;
          thirst = 0;
        } else {
          cout << "\n\t\t| The canteen is empty :( |\n\n";
        }
        cin.get();
        break;
      case 'B': case 'b':           // Option B: Move in moderate speed
        miles = (rand() % (12 - 5 +1)) + 5;
        miles_traveled += miles;
        thirst++;
        camel_tiredness++;
        natives_distance += (((rand() % (14 - 7 +1)) + 7) - miles);
        cout << "\n\t\t>> You traveled " << miles << " miles.\n\n";
        oasis(thirst, natives_distance, camel_tiredness, canteen_drinks);
        cin.get();
        break;
      case 'C': case 'c':           // Option C: Move in full speed
        miles = (rand() % (20 - 10 + 1)) + 10;
        miles_traveled += miles;
        thirst++;
        camel_tiredness++;
        natives_distance += (((rand() % (18 - 9 +1)) + 9) - miles);
        cout << "\n\t\t>> You traveled " << miles << " miles.\n\n";
        oasis(thirst, natives_distance, camel_tiredness, canteen_drinks);
        cin.get();
        break;
      case 'D': case 'd':           // Option D: Stop & Rest
        natives_distance += (rand() % (14 - 7 +1)) + 7;
        camel_tiredness = 0;
        cout << "\n\t\t(^) The camel is happy! But the natives are closer!\n\n";
        cin.get();
        break;
      case 'E': case 'e':           // Option E: See Status
        status(miles_traveled, canteen_drinks, natives_distance);
        cin.get();
        break;
      case 'Q': case 'q':           // Option Q: Quit the game
        done = 1;
    }

    // Checks Natives Distance
    if (natives_distance >= 0) {
      system("cls");
      cout << "\t\tThe natives got you! You are dead!\n" << endl;
      dead();
      done = 1;
      } else {
        if (abs(natives_distance) < 15)
          cout << "\t\t(*) The natives are getting close!\n" << endl;
      }

    // Check User's thirst
    if (thirst > 6) {
      system("cls");
      cout << "\t\t\tYou died of thirst!\n" << endl;
      dead();
      done = 1;
      } else {
        if (thirst > 4 && !(camel_tiredness > 8))
          cout << "\t\t(*) You are thirsty.\n" << endl;
      }

    // Check Camel's tiredness
    if (camel_tiredness > 8) {
      system("cls");
      cout << "\t\t\tYour camel is dead.\n" << endl;
      dead();
      done = 1;
      } else {
        if (camel_tiredness > 5 && !(thirst > 6))
          cout << "\t\t(*) Your camel is getting tired.\n" << endl;
      }

    // Checks Distance for the WIN!!
    if (miles_traveled >= 200 && !(camel_tiredness > 8 || thirst > 6)) {
      win();
      done = 1;
    }
  cout << " Press [Enter] to continue...";
  clearScreen();
  }
  return 0;
}

void intro()
{
  cout << "\t\t\t\t Welcome to Camel!\n";
  cout << " Indiana Jones have stolen a camel to make your way across the great Mobi desert.\n";
  cout << "           The natives want their camel back and are chasing you down!\n";
  cout << "\t        Survive your desert trek and outrun the natives.\n\n";
}

void menu()
{
  cout << "\t\tA. Drink from your canteen.\n";
  cout << "\t\tB. Ahead moderate speed.\n";
  cout << "\t\tC. Ahead full speed.\n";
  cout << "\t\tD. Stop and rest.\n";
  cout << "\t\tE. Status check.\n";
  cout << "\t\tQ. Quit.\n";
  cout << "\t\tYour choice? ";
}

void status(int miles, int drinks, int natives)
{
  cout << "\n\t\t| Miles traveled: " << miles << endl;
  cout << "\t\t| Drinks in canteen: " << drinks << endl;
  cout << "\t\t| The natives are " << abs(natives) << " miles behind you.\n\n";
}

void clearScreen()
{
  cin.get();
  system("cls");
}

void oasis(int &thirst, int natives_distance, int &camel_tiredness, int &canteen_drinks)
{
  // Find an oasis
  int find_oasis = (rand() % (40 - 1 +1) + 1);
  if (find_oasis == 15 || find_oasis == 27 && !(thirst > 6 || natives_distance >=0 || camel_tiredness > 8)) {
    canteen_drinks = 3;
    camel_tiredness  = 0;
    thirst = 0;
    cout << "\t\t<!><!> You found an Oasis <!><!>\n" << endl;
  }
}

void tryAgain()
{
  char yesNo;

  while (yesNo != 'n') {
    cout << "\n\t\t\t  Try again (y/N)?  ";
    cin >> yesNo;
    system("cls");

    if (yesNo == 'y' || yesNo == 'Y') {
      system("cls");
      main();
    }
  }
}

void drawing()
{
  printf(
			"                ,,__\n"
			"      ..  ..   / o._)                   .---.\n"
			"     /--'/--\\  \\-'||        .----.    .'     '.\n"
			"    /        \\_/ / |      .'      '..'         '-.\n"
		   "  .'\\  \\__\\  __.'.'     .'          i-._\n"
			"    )\\ |  )\\ |      _.'\n"
			"   // \\\\ // \\\\            By: Kevin Hernandez\n"
		   "  ||_  \\\\|_  \\\\_               Raynier Santana\n"
		   "  '--' '--'' '--'               Kimberly Pereyra \n\n\n");
}

void dead()
{
  printf(
"\t\t             _.--\"\"--._\n"
"\t\t            /  _    _  \\\n"
"\t\t          _ ( (_\\  /_) )  _\n"
"\t\t        { \\._\\   /\\   /_./ }\n"
"\t\t        /_\"=-.}______{.-=\"_\\\n"
"\t\t         _  _.=(\"\"\"\")=._  _\n"
"\t\t        (_\'\"_.-\"`~~`\"-._\"\'_)\n"
"\t\t         {_\"            \"_}\n\n"
);
  tryAgain();
}

void win()
{
  for (int i = 0; i <= 8000; i++) {
    if (i <= 1000) {
      cout << "You Win!!!!!" << endl;
      }
      else
        {
          if (i <= 2000) {
            cout << "\tY Ou Win!!!!!" << endl;
            }
            else
              {
                if (i <= 3000) {
                  cout << "\t\tY O U Win!!!!!" << endl;
                  }
                  else
                    {
                      if (i <= 4000) {
                        cout << "\t\t\tY O U W In!!!!!" << endl;
                        }
                        else
                          {
                            if (i <= 5000) {
                              cout << "\t\t\t\tY O U W I N!!!!!" << endl;
                              }
                              else
                                {
                                  if (i <= 6000) {
                                    cout << "\t\t\t\t\tY O U W I n !!!!!" << endl;
                                    }
                                    else
                                      {
                                        if (i <= 7000) {
                                          cout << "\t\t\t\t\t\tY O U W i n!!!!!" << endl;
                                        }
                                        else
                                          {
                                            cout << "\t\t\t\t\t\t\tY O u W in!!!!!" << endl;
                                            if (i == 8000) {
                                              system("cls");
                                              for (int i = 0; i < 3; i++) {
                                                printf(
                                                      "\t\t*****               *****   ******   ********    *****\n"
                                                      "\t\t****             ****      ****     ********   ****\n"
                                                      "\t\t****   *****   ****       ****     **** ****  ****\n"
                                                      "\t\t**** *** *** ****        ****     ****  **** ****\n"
                                                      "\t\t******   ******         ****     ****   ********\n"
                                                      "\t\t****     ****         ******   *****    ********\n\n\n"
                                                      );
                                                  }
                                             }
                                          }
                                      }
                                  }
                             }
                        }
                   }
             }
       }
    tryAgain();
}
