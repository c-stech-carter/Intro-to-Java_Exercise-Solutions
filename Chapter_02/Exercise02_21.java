/*
Solution for Exercise 2-21 From Intro to Java 13th Edition

2.21 (Financial application: calculate future investment value) Write a program that reads in
investment amount, annual interest rate, and number of years and displays the future
investment value using the following formula:

futureInvestmentValue =
investmentAmount × (1 + monthlyInterestRate)^(numberOfYears*12)

For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1,
the future investment value is 1032.98.

Sample Run for Exercise02_21.java

Enter input data for the program (Sample data provided below. You may modify it.)
1000.56 4.25 1

Execution Result:
JDK18>java Exercise02_21
Enter the investment amount, for example 120000.95: 1000.56
Enter annual interest rate, for example 8.25: 4.25
Enter number of years as an integer, for example 5: 1
Future value is $1043.92

JDK18>
*/

import java.util.Scanner;

public class Exercise02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for investment amount
        System.out.print("Enter the investment amount, for example 120000.95: ");
        double investmentAmount = input.nextDouble();

        // Prompt user for annual interest rate
        System.out.print("Enter annual interest rate, for example 8.25: ");
        double annualInterestRate = input.nextDouble();

        // Prompt user for number of years
        System.out.print("Enter number of years as an integer, for example 5: ");
        int numberOfYears = input.nextInt();

        // Compute monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Compute future investment value
        double futureInvestmentValue = investmentAmount *
                Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        // Round to two decimal places
        futureInvestmentValue = (int)(futureInvestmentValue * 100) / 100.0;

        // Display result
        System.out.println("Future value is $" + futureInvestmentValue);
    }
}
