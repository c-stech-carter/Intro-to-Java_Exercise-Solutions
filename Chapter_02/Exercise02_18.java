/*
Solution for Exercise 2-18 from Intro to Java 13th Edition

2.18 (Print a table) Write a program that displays the following table. Cast floating-point
numbers into integers.

Sample Run for Exercise02_18.java

Execution Result:
JDK18>java Exercise02_18
a   b   pow(a, b)
1   2   1
2   3   8
3   4   81
4   5   1024
5   6   15625

JDK18>
*/

public class Exercise02_18 {
    public static void main(String[] args) {
        // Print table header
        System.out.println("a   b   pow(a, b)");

        // Print each row manually (since loops aren’t introduced until later chapters)
        System.out.println("1   2   " + (int)Math.pow(1, 2));
        System.out.println("2   3   " + (int)Math.pow(2, 3));
        System.out.println("3   4   " + (int)Math.pow(3, 4));
        System.out.println("4   5   " + (int)Math.pow(4, 5));
        System.out.println("5   6   " + (int)Math.pow(5, 6));
    }
}
