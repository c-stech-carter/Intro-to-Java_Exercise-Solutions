/*
Solution for Exercise 2-22 from Intro to Java 13th Edition

2.22 (Financial application: monetary units) Rewrite CodeAnimation 2.10,
ComputeChange.java, to fix the possible loss of accuracy when converting a double value to
an int value. Enter the input as an integer whose last two digits represent the cents. For
example, the input 1156 represents 11 dollars and 56 cents.

Sample Run for Exercise02_22.java

Enter input data for the program (Sample data provided below. You may modify it.)
4376

Execution Result:
JDK18>java Exercise02_22
Enter an amount in integer, for example 1156
for 11 dollars and 56 cents: 4376
Your amount 4376 consists of
43 dollars
3 quarters
0 dimes
0 nickels
1 pennies

JDK18>
*/

import java.util.Scanner;

public class Exercise02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Receive the amount as an integer (last two digits are cents)
        System.out.print("Enter an amount in integer, for example 1156 for 11 dollars and 56 cents: ");
        int amount = input.nextInt();

        // Extract dollars and cents
        int remainingAmount = amount;

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}
