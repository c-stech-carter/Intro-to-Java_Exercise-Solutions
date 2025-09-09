/*
Solution for Exercise 2-15 from Intro to Java 13th Edition

2.15 (Geometry: distance of two points) Write a program that prompts the user to enter two
points (x1, y1) and (x2, y2) and displays their distance. The formula for computing the
distance is

√((x2 – x1)^2 + (y2 – y1)^2).

Note you can use Math.pow(a, 0.5) to compute √a.

Sample Run for Exercise02_15.java

Enter input data for the program (Sample data provided below. You may modify it.)
1.5 -3.4 4.0 5.0

Execution Result:
JDK18>java Exercise02_15
Enter x1 and y1: 1.5 -3.4
Enter x2 and y2: 4.0 5.0
The distance of the two points is 8.764131445842194

JDK18>
*/

import java.util.Scanner;

public class Exercise02_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter (x1, y1)
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // Prompt the user to enter (x2, y2)
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Compute distance using the formula
        double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);

        // Display result
        System.out.println("The distance of the two points is " + distance);
    }
}
