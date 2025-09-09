/*
Solution for Exercise 2-16 from Intro to Java 13th Edition

2.16 (Geometry: area of hexagon) Write a program that prompts the user to enter the side of a
hexagon and displays its area. The formula for computing the area of a hexagon is

Area = (3 * √3 / 2) * s^2,

where s is the length of a side.

Sample Run for Exercise02_16.java

Enter input data for the program (Sample data provided below. You may modify it.)
5.5

Execution Result:
JDK18>java Exercise02_16
Enter the side: 5.5
The area of the hexagon is 78.59180539343781

JDK18>
*/


import java.util.Scanner;

public class Exercise02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side of the hexagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Compute area using the formula (3 * √3 / 2) * s^2
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);

        // Display result
        System.out.println("The area of the hexagon is " + area);
    }
}
