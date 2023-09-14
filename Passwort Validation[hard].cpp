/*You're interviewing to join a security team. They want to see you build a password evaluator for your technical interview to validate the input.

Task:
Write a program that takes in a string as input and evaluates it as a valid password. The password is valid if it has at a minimum 2 numbers, 2 of the following special characters ('!', '@', '#', '$', '%', '&', '*'), and a length of at least 7 characters.
If the password passes the check, output 'Strong', else output 'Weak'.

Input Format:
A string representing the password to evaluate.

Output Format:
A string that says 'Strong' if the input meets the requirements, or 'Weak', if not.

Sample Input:
Hello@$World19

Sample Output:
Strong
*/

#include <iostream>
#include <cctype>
#include <string>

int main() {
    std::string password;
    std::cin >> password;

    int numbers = 0;
    int symbols = 0;
    int letters = 0;
    int space = 0;

    for (char c : password) {
        if (std::isdigit(c)) {
            numbers++;
        }
        else if (std::isalpha(c)) {
            letters++;
        }
        else if (std::isspace(c)) {
            space++;
        }
        else {
            symbols++;
        }
    }

    if (numbers >= 2 && symbols >= 2 && password.size() >= 8 && letters >= 2 && space == 0) {
        std::cout << "Strong" << std::endl;
        return 0; // Завершаем программу
    }
    else {
        std::cout << "Weak" << std::endl;
        return 0; // Завершаем программу
    }
}
