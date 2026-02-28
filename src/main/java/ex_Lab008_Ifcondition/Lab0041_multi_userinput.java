package ex_Lab008_Ifcondition;

import java.util.Scanner;

public class Lab0041_multi_userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter the side 1");
        int side1 = scanner.nextInt();

        System.out.println("enter the side 2");
        int side2 = scanner.nextInt();

        System.out.println("enter the side 3");
        int side3 = scanner.nextInt();

        System.out.println(side1+side2+side3);
    }
}
