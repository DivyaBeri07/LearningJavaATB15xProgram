package ex_Lab009_Switchstmnts;

import java.util.Scanner;

public class Lab0046_switch_invalidentry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the valid number from 1 to 7");

        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

        }
    }
}
