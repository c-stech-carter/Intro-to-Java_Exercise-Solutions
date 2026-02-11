/*
3.2 (Game: add three numbers)

The program in CodeAnimation 3.1, AdditionQuiz.java, generates two integers
and prompts the user to enter the sum of these two integers.

Revise the program to generate three single-digit integers and prompt
the user to enter the sum of these three integers.

(This exercise can't be graded automatically with the check exercises tool)
*/

import java.util.Scanner;

public class Exercise03_02 {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        int number3 = (int)(System.currentTimeMillis() / 100 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + " + " + number3 + "? ");

        int answer = input.nextInt();

        System.out.println(
                number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
                        (number1 + number2 + number3 == answer)
        );
    }
}
