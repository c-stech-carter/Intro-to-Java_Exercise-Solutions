/*
Solution for Exercise 2-2 from Intro to Java 13th Edition

2.2 (Compute the volume of a cylinder)
Write a program that reads in the radius and length of a cylinder and computes
the area and volume using the following formulas:

    area = radius * radius * π
    volume = area * length
*/

import java.util.Scanner;

public class Exercise02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = Math.PI * radius * radius;
        double volume = length * area;

        System.out.println("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + volume);
    }
}
