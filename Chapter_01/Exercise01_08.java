/*
Solution to Exercise 1-8 in Intro to Java 13th Edition

1.8 (Area and perimeter of a circle)
Write a program that displays the area and perimeter of a circle
that has a radius of 5.5 using the following formulas:

perimeter = 2 * radius * pi
area = radius * radius * pi
*/


public class Exercise01_08 {
    public static void main(String[] args) {
        //Expected solution to the exercise:
        System.out.println("The area of a circle with the radius " + 5.5 + " is: " + (3.14159 * 5.5 * 5.5));
        System.out.println("The perimeter of the same circle is: " + (2 * 3.14159 * 5.5));


        //The following is a little more reusable:
        /*
        final double PI = 3.14159;
        double radius = 5.5;

        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

       System.out.println("The area of a circle with the radius " + radius + " is: " + area);
       System.out.println("The perimeter of the same circle is: " + perimeter));
        */
    }
}
