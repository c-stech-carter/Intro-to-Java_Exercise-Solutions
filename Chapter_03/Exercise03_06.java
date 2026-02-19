/*
3.6 (Health application: BMI) Revise CodeAnimation 3.4,
ComputeAndInterpretBMI.java, to let the user enter weight,
feet, and inches. For example, if a person is 5 feet and
10 inches, you will enter 5 for feet and 10 for inches.

Sample Run for Exercise03_06.java

Enter input data for the program (Sample data provided below. You may modify it.)
140.5 5 10

Execution Result:
JDK18> java Exercise03_06
Enter weight in pounds: 140.5
Enter feet: 5.0
Enter inches: 10.0
BMI is 20.159444069245282
Normal

JDK18>
*/

import java.util.Scanner;

public class Exercise03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        // Constants for unit conversion
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Convert weight to kilograms
        double weightKilograms = weightPounds * KILOGRAMS_PER_POUND;

        // Convert height (feet + inches) to inches, then to meters
        double heightInches = feet * 12 + inches;
        double heightMeters = heightInches * METERS_PER_INCH;

        // Compute BMI
        double bmi = weightKilograms / (heightMeters * heightMeters);

        System.out.println("BMI is " + bmi);

        // Interpret BMI
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}
