/*
Solution to Exercise 2-23 from Intro to Java 13th Edition

2.23 (Cost of driving) Write a program that prompts the user to enter the distance to drive,
the fuel efficiency of the car in miles per gallon, and the price per gallon then displays the
cost of the trip.

Sample Run for Exercise02_23.java

Enter input data for the program (Sample data provided below. You may modify it.)
900.5 25.5 3.55

Execution Result:
JDK18>java Exercise02_23
Enter the driving distance: 900.5
Enter miles per gallon: 25.5
Enter price per gallon: 3.55
The cost of driving is $125.36372549019607

JDK18>
*/

import java.util.Scanner;

public class Exercise02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for driving distance
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        // Prompt user for miles per gallon
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        // Prompt user for price per gallon
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        // Calculate cost of driving
        double cost = (distance / milesPerGallon) * pricePerGallon;

        // Display result
        System.out.println("The cost of driving is $" + cost);
    }
}
