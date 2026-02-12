/*
3.3 (Algebra: solve 2 × 2 linear equations) A linear equation can be solved
using Cramer’s rule given in Programming Exercise 1.13. Write a program
that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad − bc is 0, report that "The equation has no solution."

Sample Run for Exercise03_03.java

Enter input data for the program (Sample data provided below. You may modify it.)

9.0 4.0 3.0 -5.0 -6.0 -21.0

Execution Result:
JDK18>java Exercise03_03
Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
x is -2.0 and y is 3.0
JDK18>
*/

import java.util.Scanner;

public class Exercise03_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double determinant = a * d - b * c;

        if (determinant == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;

            System.out.println("x is " + x + " and y is " + y);
        }

        input.close();
    }
}
