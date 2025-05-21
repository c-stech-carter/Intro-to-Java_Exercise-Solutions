/*
Solution for Exercise 2-5 from Intro to Java 13th Edition

2.5 (Financial application: calculate tips)
Write a program that reads the subtotal and the gratuity rate, then computes the gratuity
and total. For example, if the user enters 10 for subtotal and 15% for gratuity rate,
the program displays $1.5 as gratuity and $11.5 as total.

Sample Run for Exercise02_05.java

Enter input data for the program (Sample data provided below. You may modify it.)
100.57 15

Execution Result:
JDK18>java Exercise02_05
Enter subtotal and gratuity rate: 100.57 15.0
The gratuity is 15.0855 total is 115.65549999999999
JDK18>
*/


import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * gratuityRate / 100.0;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is " + gratuity);
        System.out.println("The total is " + total);
    }
}
