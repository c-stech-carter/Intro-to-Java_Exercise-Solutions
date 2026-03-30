/*
(Sort three integers) Write a program that prompts the user
to enter three integers and display the integers in
non-decreasing order.

Sample Run:
Enter three integers: 512 80 11
The sorted numbers are 11 80 512
*/

import java.util.Scanner;

public class Exercise03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
    }
}
