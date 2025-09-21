/*
Solution for Exercise 2-19 from intro to Java 13th Edition

2.19 (Geometry: area of a triangle) Write a program that prompts the user to enter three
points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area. The formula
for computing the area of a triangle is

s = (side1 + side2 + side3) / 2;
area = √(s(s – side1)(s – side2)(s – side3))

Sample Run for Exercise02_19.java

Enter input data for the program (Sample data provided below. You may modify it.)
1.5 -3.4 4.6 5.0 9.5 -3.4

Execution Result:
JDK18>java Exercise02_19
Enter three points for a triangle: 1.5 -3.4 4.6 5.0 9.5 -3.4
The area of the triangle is 33.600000000000016

JDK18>
*/

import java.util.Scanner;

public class Exercise02_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for three points
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Compute the lengths of the three sides
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Compute s (semi-perimeter)
        double s = (side1 + side2 + side3) / 2;

        // Compute area using Heron’s formula
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Display result
        System.out.println("The area of the triangle is " + area);
    }
}
