/*
Solution for Exercise 2-8 from Intro to Java 13th Edition:

2.8 (Current time) LiveExample 2.7, ShowCurrentTime.java, gives a program
that displays the current time in GMT. Revise the program so that it prompts
the user to enter the time zone in hours away from (offset to) GMT and
displays the time in the specified time zone.
 */


import java.util.Scanner;

public class Exercise02_08 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for the time zone offset from GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // Get the total milliseconds since Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Convert to seconds
        long totalSeconds = totalMilliseconds / 1000;

        // Get current second
        long currentSecond = totalSeconds % 60;

        // Convert to minutes
        long totalMinutes = totalSeconds / 60;

        // Get current minute
        long currentMinute = totalMinutes % 60;

        // Convert to hours
        long totalHours = totalMinutes / 60;

        // Get current hour in GMT
        long currentHour = totalHours % 24;

        // Apply offset and normalize to 24-hour clock using remainder
        long displayHour = (currentHour + offset + 24) % 24;

        // Display the result
        System.out.println("Current time is " + displayHour + ":" + currentMinute + ":" + currentSecond + " in your time zone");
    }
}
