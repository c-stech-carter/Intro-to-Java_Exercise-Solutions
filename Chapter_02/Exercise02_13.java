/*
**2.13 (Financial application: compound value) Suppose you save $100 each month into a savings account with an annual interest rate of 5%.
Therefore, the monthly interest rate is 0.05 / 12 = 0.00417.

After the first month, the value in the account becomes
100 * (1 + 0.00417) = 100.417

After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252

After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507

and so on.

Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month.
(In Programming Exercise 5.30, you will use a loop to simplify the code and display the account value for any month.)
*/

/*
Sample Run for Exercise02_13.java

Enter input data for the program (Sample data provided below. You may modify it.)
100.0

Execution Result:
JDK18>java Exercise02_13
Enter monthly saving amount: 100.0
After the first month, the account value is 100.417
After the second month, the account value is 201.25207083333333
After the third month, the account value is 302.507287951389
After the sixth month, the account value is 608.8113580414857

JDK18>
*/


import java.util.Scanner;

public class Exercise02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for monthly saving amount
        System.out.print("Enter monthly saving amount: ");
        double savingAmount = input.nextDouble();

        // Monthly interest rate
        double monthlyInterestRate = 0.05 / 12;

        // First month
        double accountValue = savingAmount * (1 + monthlyInterestRate);
        System.out.println("After the first month, the account value is " + accountValue);

        // Second month
        accountValue = (savingAmount + accountValue) * (1 + monthlyInterestRate);
        System.out.println("After the second month, the account value is " + accountValue);

        // Third month
        accountValue = (savingAmount + accountValue) * (1 + monthlyInterestRate);
        System.out.println("After the third month, the account value is " + accountValue);

        // Fourth month
        accountValue = (savingAmount + accountValue) * (1 + monthlyInterestRate);

        // Fifth month
        accountValue = (savingAmount + accountValue) * (1 + monthlyInterestRate);

        // Sixth month
        accountValue = (savingAmount + accountValue) * (1 + monthlyInterestRate);
        System.out.println("After the sixth month, the account value is " + accountValue);
    }
}
