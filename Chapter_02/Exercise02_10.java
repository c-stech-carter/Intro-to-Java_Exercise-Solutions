/*
 Solution for Exercise 2-10 from Intro to Java 13th Edition

 2.10 (Science: calculating energy) Write a program that calculates the energy
 needed to heat water from an initial temperature to a final temperature. Your
 program should prompt the user to enter the amount of water in kilograms and
 the initial and final temperatures of the water. The formula to compute the
 energy is

     Q = M * (finalTemperature - initialTemperature) * 4184

 where M is the weight of water in kilograms, temperatures are in degrees
 Celsius, and energy Q is measured in joules.

 Sample Run for Exercise02_10.java

 Enter input data for the program (Sample data provided below. You may modify it.)
 55.5 3.5 10.5

 Execution Result:
 JDK24>java Exercise02_10
 Enter the amount of water in kilograms: 55.5
 Enter the initial temperature: 3.5
 Enter the final temperature: 10.5
 The energy needed is 1625484.0

 JDK24>
*/

import java.util.Scanner;

public class Exercise02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double mass = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double energy = mass * (finalTemperature - initialTemperature) * 4184;

        System.out.println();
        System.out.println("The energy needed is: " + energy);
    }
}
