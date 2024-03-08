package ConditionStatement;

import java.util.Scanner;

public class PrintTheLargestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Enter your first number :");
        num1 = scanner.nextInt();

        System.out.print("Enter your first number :");
        num2 = scanner.nextInt();

        System.out.print("Enter your first number :");
        num3 = scanner.nextInt();

        if (num1 >= num2 && num2 >= num3) {
            System.out.println("This is the largest number :" + num1);
        } else if (num2 >= num3) {
            System.out.println("This is the largest number :" + num2);
        } else {
            System.out.println("This is the largest number :" + num3);
        }

    }
}
