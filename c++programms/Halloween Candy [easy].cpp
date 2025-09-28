/*
You go trick or treating with a friend and all but three of the houses that you visit are giving out candy.
One house that you visit is giving out toothbrushes and two houses are giving out dollar bills.

Task
Given the input of the total number of houses that you visited, what is the percentage chance that one random item
pulled from your bag is a dollar bill?

Input Format
An integer (>=3) representing the total number of houses that you visited.

Output Format
A percentage value rounded up to the nearest whole number.

Sample Input
4

Sample Output
50
*/

// Logic: 2Houses=dollars;

#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double houses;
    cin >> houses;
    int dollars = 2;

    double result = ((dollars / houses) * 100);

    int answer = round(result);
    cout << answer;
    return 0;
}