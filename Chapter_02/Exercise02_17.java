/*
Solution for Exercise 2-17 from Intro to Java 13th Edition

2.17 (Science: wind-chill temperature) How cold is it outside? The temperature alone is not
enough to provide the answer. Other factors including wind speed, relative humidity, and
sunshine play important roles in determining coldness outside. In 2001, the National Weather
Service (NWS) implemented the new wind-chill temperature to measure the coldness using
temperature and wind speed. The formula is

twc = 35.74 + 0.6215ta – 35.75v^0.16 + 0.4275ta v^0.16

where ta is the outside temperature measured in degrees Fahrenheit, v is the speed
measured in miles per hour, and twc is the wind-chill temperature. The formula cannot be
used for wind speeds below 2 mph or temperatures below –58°F or above 41°F.

Write a program that prompts the user to enter a temperature between –58°F and 41°F and
a wind speed greater than or equal to 2 then displays the wind-chill temperature. Use
Math.pow(a, b) to compute v^0.16.

Sample Run for Exercise02_17.java

Enter input data for the program (Sample data provided below. You may modify it.)
5.3 6.0

Execution Result:
JDK18>java Exercise02_17
Enter the temperature in Fahrenheit between –58°F and 41°F: 5.3
Enter the wind speed miles per hour (must be greater than or equal to 2): 6.0
The wind chill index is -5.567068455881625

JDK18>
*/


import java.util.Scanner;

public class Exercise02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for temperature
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();

        // Prompt user for wind speed
        System.out.print("Enter the wind speed miles per hour (must be greater than or equal to 2): ");
        double windSpeed = input.nextDouble();

        // Compute wind-chill temperature
        double windChill = 35.74
                + (0.6215 * temperature)
                - (35.75 * Math.pow(windSpeed, 0.16))
                + (0.4275 * temperature * Math.pow(windSpeed, 0.16));

        // Display result
        System.out.println("The wind chill index is " + windChill);
    }
}
