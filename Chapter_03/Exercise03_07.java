/*
3.7 (Financial application: monetary units) Modify CodeAnimation 2.10,
ComputeChange.java, to display the nonzero denominations only, using
singular words for single units such as 1 dollar and 1 penny, and
plural words for more than one unit such as 2 dollars and 3 pennies.
*/

import java.util.Scanner;

public class Exercise03_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");

        if (numberOfDollars > 0) {
            System.out.println(numberOfDollars + " dollar"
                    + (numberOfDollars == 1 ? "" : "s"));
        }

        if (numberOfQuarters > 0) {
            System.out.println(numberOfQuarters + " quarter"
                    + (numberOfQuarters == 1 ? "" : "s"));
        }

        if (numberOfDimes > 0) {
            System.out.println(numberOfDimes + " dime"
                    + (numberOfDimes == 1 ? "" : "s"));
        }

        if (numberOfNickels > 0) {
            System.out.println(numberOfNickels + " nickel"
                    + (numberOfNickels == 1 ? "" : "s"));
        }

        if (numberOfPennies > 0) {
            System.out.println(numberOfPennies + " penn"
                    + (numberOfPennies == 1 ? "y" : "ies"));
        }
    }
}
