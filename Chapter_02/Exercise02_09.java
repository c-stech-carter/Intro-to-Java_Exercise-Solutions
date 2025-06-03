/*
Solution for Exercise 2-9 from Intro to Java

2.9 (Physics: acceleration) Average acceleration is defined as the change of
velocity divided by the time taken to make the change, as shown in the following
formula:

     a = (v1 - v0) / t

Write a program that prompts the user to enter the starting velocity v0 in
meters/second, the ending velocity v1 in meters/second, the time span t in
seconds, and then displays the average acceleration.

Sample Run for Exercise02_09.java:
Enter input data for the program (Sample data provided below. You may modify it.)
5.5 50.9 4.5

Execution Result:
JDK18>java Exercise02_09
Enter v0, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.088888888888889
*/


import java.util.Scanner;

public class Exercise02_09 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter v0, v1, and t
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble(); // starting velocity
        double v1 = input.nextDouble(); // ending velocity
        double t = input.nextDouble();  // time in seconds

        // Calculate average acceleration
        double a = (v1 - v0) / t;

        // Display the result
        System.out.println("The average acceleration is " + a);
    }
}

