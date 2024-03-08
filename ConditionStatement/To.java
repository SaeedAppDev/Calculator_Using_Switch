package ConditionStatement;

import java.util.Scanner;

public class To {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Enter your first number :");
        number = scanner.nextInt();

        String result = (number % 2 == 0) ? "Even Number :" : "Odd Number";
        System.out.println("Result :" + result);
    }
}
