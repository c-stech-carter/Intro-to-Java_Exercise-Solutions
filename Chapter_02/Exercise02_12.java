/*
Solution for Exercise 2-12 from Intro to Java 13th Edition

2.12 (Physics: finding runway length) Given an airplane’s acceleration a and
take-off speed v, you can compute the minimum runway length needed for an
airplane to take off using the following formula:

        length = v^2 / 2a

Write a program that prompts the user to enter v in meters/second (m/s),
the acceleration a in meters/second squared (m/s^2), and then displays the
minimum runway length.

Sample Run for Exercise02_12.java

Enter input data for the program (Sample data provided below. You may modify it.)
60.5 3.5

Execution Result:
JDK18>java Exercise02_12
Enter speed v: 60.5
Enter acceleration a: 3.5
The minimum runway length for this airplane is 522.8928571428571 meters

JDK18>
*/


import java.util.Scanner;

public class Exercise02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed: ");
        double speed = input.nextDouble();
        System.out.print("Enter acceleration: ");
        double acceleration = input.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + length + " meters");
    }
}
