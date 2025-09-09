/*
Solution for Exercise 2-14 from Intro to Java 13th Edition

2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight.
It can be calculated by taking your weight in kilograms and dividing by the square of your height
in meters. Write a program that prompts the user to enter a weight in pounds and height in inches
and displays the BMI. Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters.

Sample Run for Exercise02_14.java

Enter input data for the program (Sample data provided below. You may modify it.)
95.5 50.0

Execution Result:
JDK18>java Exercise02_14
Enter weight in pounds: 95.5
Enter height in inches: 50.0
BMI is 26.857257942215885

JDK18>
*/

import java.util.Scanner;

public class Exercise02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Prompt the user for height in inches
        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        // Conversion constants
        double KILOGRAMS_PER_POUND = 0.45359237;
        double METERS_PER_INCH = 0.0254;

        // Convert weight to kilograms
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;

        // Convert height to meters
        double heightInMeters = heightInInches * METERS_PER_INCH;

        // Compute BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
    }
}
