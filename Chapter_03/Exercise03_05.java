/*
3.5 (Find future dates) Write a program that prompts the user to enter an integer
for today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6).
Also prompt the user to enter the number of days after today for a future day
and display the future day of the week.

Sample Run:

Enter today’s day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
*/

import java.util.Scanner;

public class Exercise03_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        int futureDayNumber = (today + elapsed) % 7;

        String todayName = "";
        String futureDayName = "";

        // Determine today's name
        switch (today) {
            case 0: todayName = "Sunday"; break;
            case 1: todayName = "Monday"; break;
            case 2: todayName = "Tuesday"; break;
            case 3: todayName = "Wednesday"; break;
            case 4: todayName = "Thursday"; break;
            case 5: todayName = "Friday"; break;
            case 6: todayName = "Saturday"; break;
        }

        // Determine future day's name
        switch (futureDayNumber) {
            case 0: futureDayName = "Sunday"; break;
            case 1: futureDayName = "Monday"; break;
            case 2: futureDayName = "Tuesday"; break;
            case 3: futureDayName = "Wednesday"; break;
            case 4: futureDayName = "Thursday"; break;
            case 5: futureDayName = "Friday"; break;
            case 6: futureDayName = "Saturday"; break;
        }

        System.out.println("Today is " + todayName +
                " and the future day is " + futureDayName);
    }
}
