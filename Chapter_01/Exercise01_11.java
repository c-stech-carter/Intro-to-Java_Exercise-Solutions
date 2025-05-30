/*
Solution to Exercise 1-11 from Intro to Java 13th Edition

1.11 (Population projection)
The U.S. Census Bureau projects population based on the following assumptions:

 - One birth every 7 seconds
 - One death every 13 seconds
 - One new international migration every 45 seconds

Write a program to display the population for each of the next five years.
Assume that the current population is 312,032,486, and one year has 365 days.

Hint: In Java, if two integers perform division, the result is an integer.
The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and
10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part,
one of the values involved in the division must be a number with a decimal
point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*/


public class Exercise01_11 {
    public static void main(String[] args) {
        System.out.println("Year 1: " + (312032486 + (365 * 24 * 60 * 60 / 7.0
                - 365 * 24 * 60 * 60 / 13.0
                + 365 * 24 * 60 * 60 / 45.0)));

        System.out.println("Year 2: " + (312032486 + 2 * (365 * 24 * 60 * 60 / 7.0
                - 365 * 24 * 60 * 60 / 13.0
                + 365 * 24 * 60 * 60 / 45.0)));

        System.out.println("Year 3: " + (312032486 + 3 * (365 * 24 * 60 * 60 / 7.0
                - 365 * 24 * 60 * 60 / 13.0
                + 365 * 24 * 60 * 60 / 45.0)));

        System.out.println("Year 4: " + (312032486 + 4 * (365 * 24 * 60 * 60 / 7.0
                - 365 * 24 * 60 * 60 / 13.0
                + 365 * 24 * 60 * 60 / 45.0)));

        System.out.println("Year 5: " + (312032486 + 5 * (365 * 24 * 60 * 60 / 7.0
                - 365 * 24 * 60 * 60 / 13.0
                + 365 * 24 * 60 * 60 / 45.0)));
    }
}


