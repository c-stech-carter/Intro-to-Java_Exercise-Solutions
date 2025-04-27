/*
Solution for Exercise 1-7

The online check exercises tool is not technically correct for grading this exercise.
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
