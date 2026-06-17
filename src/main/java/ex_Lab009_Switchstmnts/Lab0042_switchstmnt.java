package ex_Lab009_Switchstmnts;

import java.util.Scanner;

/*
 Logic Building Formula:

     Step 1 - Number one is using the Scanner class.
     Step 2 - number two will be basically figuring out the expression and the day.
     Step 3 - We will basically add step 3 as a rough logic.
     Step 4 - 4 is you will write the fix the logic and optimize.
     Step 5 - figure out the edge cases.

 */
public class Lab0042_switchstmnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7 for thr day program");

        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Please enter the valid day");

        }


    }
}
