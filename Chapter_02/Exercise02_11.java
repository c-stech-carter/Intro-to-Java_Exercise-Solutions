/*
Solution for Exercise 2-11 from Into to Java 13th Edition

2.11 (Population projection) Rewrite Programming Exercise 1.11 to prompt the
user to enter the number of years and display the population after the number
of years. Use the hint in Programming Exercise 1.11 for this program. Here is a
sample run of the program:

Sample Run for Exercise02_11.java

Enter input data for the program (Sample data provided below. You may modify it.)
5

Execution Result:
JDK24>java Exercise02_11
Enter the number of years: 5
The population in 5 years is 325932969

JDK24>

* (Original exercise from Chapter 1:)
* 1.11 (Population projection)
* The U.S. Census Bureau projects population based on the following assumptions:
*
* - One birth every 7 seconds
* - One death every 13 seconds
* - One new international migration every 45 seconds
*
* Write a program to display the population for each of the next five years.
* Assume that the current population is 312,032,486, and one year has 365 days.
*
* Hint: In Java, if two integers perform division, the result is an integer.
* The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and
* 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part,
* one of the values involved in the division must be a number with a decimal
* point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*/


import java.util.Scanner;

public class Exercise02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        // Constants
        int currentPopulation = 312032486;
        double secondsPerYear = 365 * 24 * 60 * 60;

        double birthsPerYear = secondsPerYear / 7.0;
        double deathsPerYear = secondsPerYear / 13.0;
        double immigrantsPerYear = secondsPerYear / 45.0;

        double populationAfterYears = currentPopulation
                + years * (birthsPerYear - deathsPerYear + immigrantsPerYear);

        System.out.println("The population in " + years + " years is " + (int)populationAfterYears);
    }
}
