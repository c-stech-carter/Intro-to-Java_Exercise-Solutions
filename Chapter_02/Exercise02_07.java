/*
Solution for Exercise 2-7 from Intro to Java 13th Edition

2.7 (Find the number of years)
Write a program that prompts the user to enter the minutes (e.g., 1 billion),
and displays the maximum number of years and remaining days for the minutes.
For simplicity, assume that a year has 365 days.

Sample Run for Exercise02_07.java

Enter input data for the program (Sample data provided below. You may modify it.)
1000000000

Execution Result:
JDK18>java Exercise02_07
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days

JDK18>
*/


import java.util.Scanner;

public class Exercise02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long minutesInDay = 60 * 24;
        long minutesInYear = minutesInDay * 365;

        long years = minutes / minutesInYear;
        long days = (minutes % minutesInYear) / minutesInDay;

        System.out.print(minutes + "minutes is approximately " + years + " years and " + days + " days.");

    }
}
