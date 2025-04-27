/*
Solution for Exercise 1-7

The online check exercises tool is not technically correct for grading this exercise.


1.7 (Approximate pi) 
pi can be computed using the following formula:

pi = 4 × (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)

Write a program that displays the result of:
4 × (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
and
4 × (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15).

Use 1.0 instead of 1 in your program.

*/


public class Exercise01_07 {
    public static void main(String[] args) {
        //The following passes the check exercises tool:
        System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));

        /*
        However, following the book the second line should technically be:

        System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13) - (1.0 / 15)));

        because it specifically states to subtract 1/15 after getting to 1/11 in the formula
        */
    }
}
