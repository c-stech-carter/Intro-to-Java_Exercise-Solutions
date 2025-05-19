/*
Solution for Exercise 2-1 from Intro to Java 13th Edition

2.1 (Convert Celsius to Fahrenheit) 
Write a program that reads a Celsius degree in a double value from the console, 
then converts it to Fahrenheit, and displays the result. 
The formula for the conversion is as follows:

    fahrenheit = (9.0 / 5) * celsius + 32

Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
*/


import java.util.Scanner;

public class Exercise02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5) + 32;
        System.out.println();
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
