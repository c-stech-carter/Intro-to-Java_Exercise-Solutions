/*
Solution for Exercise 2-3 from Intro to Java 13th Edition

2.3 (Convert feet into meters)
Write a program that reads a number in feet, converts it to meters, and displays the result.
One foot is 0.305 meter.
*/


import java.util.Scanner;

public class Exercise02_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
