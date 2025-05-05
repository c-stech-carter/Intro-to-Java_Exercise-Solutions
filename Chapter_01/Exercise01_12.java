/*
Solution to Exercise 1-12 from Intro to Java 13th Edition

1.12 (Average speed in kilometers)
Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
Write a program that displays the average speed in kilometers per hour.
(Note: 1 mile is equal to 1.6 kilometers.)
 */

public class Exercise01_12 {
    public static void main(String[] args) {
        System.out.println("A runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.");
        System.out.print("The average speed in kilometers per hour is: ");
        System.out.println((24 * 1.6) / ((60 * 60 + 40 * 60 + 35) / 3600.0)); //3600 is the number of seconds in an hour
    }
}
