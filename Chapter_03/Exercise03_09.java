/*
(Business: check ISBN-10) An ISBN-10 consists of 10 digits:
d1 d2 d3 d4 d5 d6 d7 d8 d9 d10.
The last digit, d10, is a checksum, which is calculated from
the other 9 digits using the following formula:

(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
 d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11

If the checksum is 10, the last digit is denoted as X.
Write a program that prompts the user to enter the first 9 digits
and displays the 10-digit ISBN (including leading zeros).
Your program should read the input as an integer.

Sample Run:
Enter the first 9 digits of an ISBN as integer: 434539934
The ISBN-10 number is 4345399343
*/

import java.util.Scanner;

public class Exercise03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        int d9 = isbn % 10;
        isbn /= 10;
        int d8 = isbn % 10;
        isbn /= 10;
        int d7 = isbn % 10;
        isbn /= 10;
        int d6 = isbn % 10;
        isbn /= 10;
        int d5 = isbn % 10;
        isbn /= 10;
        int d4 = isbn % 10;
        isbn /= 10;
        int d3 = isbn % 10;
        isbn /= 10;
        int d2 = isbn % 10;
        isbn /= 10;
        int d1 = isbn % 10;

        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 +
                d5 * 5 + d6 * 6 + d7 * 7 +
                d8 * 8 + d9 * 9) % 11;

        System.out.print("The ISBN-10 number is " +
                d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);

        if (checksum == 10) {
            System.out.println("X");
        } else {
            System.out.println(checksum);
        }
    }
}
