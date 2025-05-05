/*
Solution to Exercise 1-9 from Intro to Java

1.9 (Area and perimeter of a rectangle)
Write a program that displays the area and perimeter of a rectangle
with a width of 4.5 and a height of 7.9 using the following formula:

area = width * height
*/

public class Exercise01_09 {
    public static void main(String[] args) {
        System.out.println("A rectangle with width of 4.5 and height of 7.9");
        System.out.println("Area of this rectangle: " + (4.5 * 7.9));
        System.out.println("Perimeter of this rectangle: " + (4.5 * 2 + 7.9 * 2));
    }
}
