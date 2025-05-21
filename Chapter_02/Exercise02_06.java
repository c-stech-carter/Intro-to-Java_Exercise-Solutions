/*
2.6 (Sum the digits in an integer)
Write a program that reads an integer between 0 and 1000 and adds all the digits
in the integer. For example, if an integer is 932, the sum of all its digits is 14.

Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.

Sample Run for Exercise02_06.java

Enter input data for the program (Sample data provided below. You may modify it.)
435

Execution Result:
JDK18>java Exercise02_06
Enter an integer between 0 and 1000: 435
The sum of all digits in 435 is 12

JDK18>
*/


import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: ");

        int number = input.nextInt();

        int firstDigit = number % 10;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number / 100 % 10;
        int fourthDigit = number / 1000 % 10;

        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;

        System.out.println("The sum of all digits in " + number + " is " + sum);

    }
}
