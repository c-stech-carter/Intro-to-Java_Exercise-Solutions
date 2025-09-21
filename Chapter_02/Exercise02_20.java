/*
Solution for Exercise 2-20 from Intro to Java 13th Edition

2.20 (Financial application: calculate interest) If you know the balance and the annual
percentage interest rate, you can compute the interest on the next monthly payment using
the following formula:

interest = balance × (annualInterestRate / 1200)

Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month.

Sample Run for Exercise02_20.java

Enter input data for the program (Sample data provided below. You may modify it.)
1000.0 3.5

Execution Result:
JDK18>java Exercise02_20
Enter balance and annual interest rate: 1000.0 3.5
The interest is 2.91

JDK18>
*/



import java.util.Scanner;

public class Exercise02_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for balance and annual interest rate
        System.out.print("Enter balance and annual interest rate: ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        // Calculate monthly interest
        double interest = balance * (annualInterestRate / 1200);

        // Display result
        System.out.println("The interest is " + interest);
    }
}
