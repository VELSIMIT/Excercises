/*
You and three friends go to a baseball game and you offer to go to the concession stand for everyone. They each order one thing, and you do as well. Nachos and Pizza both cost $6.00. A Cheeseburger meal costs $10. Water is $4.00 and Coke is $5.00. Tax is 7%.

Task
Determine the total cost of ordering four items from the concession stand. If one of your friend’s orders something that isn't on the menu, you will order a Coke for them instead.

Input Format
You are given a string of the four items that you've been asked to order that are separated by spaces.

Output Format
You will output a number of the total cost of the food and drinks.

Sample Input
'Pizza Cheeseburger Water Popcorn'

Sample Output
26.75
*/

#include <iostream>
using namespace std;

class Menu {
public:
	int choice(string orderinput) {
		double Nachos = 6;
		double Pizza = 6;
		double Cheeseburger = 10;
		double Water = 4;
		double Coke = 5;

		if (orderinput == "Nachos") {
			return(Nachos);
		}
		if (orderinput == "Pizza") {
			return(Pizza);
		}
		if (orderinput == "Cheeseburger") {
			return(Cheeseburger);
		}
		if (orderinput == "Water") {
			return(Water);
		}
		if (orderinput == "Coke") {
			return(Coke);
		}
		else {
			return(Coke);
		}
	}
};

int main() {
	string p1, p2, p3, p4;
	Menu obj1, obj2, obj3, obj4;
	cin >> p1 >> p2 >> p3 >> p4;

	double total = (obj1.choice(p1) + obj2.choice(p2) + obj3.choice(p3) + obj4.choice(p4)) * 1.07;
	cout << total;
	return 0;
}