package ConditionStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number :");
        int number1 = scanner.nextInt();

        System.out.println("Enter your operator :");
        char character = scanner.next().charAt(0);

        System.out.println("Enter your second number :");
        int number2 = scanner.nextInt();

        int result;
        switch (character) {
            case '+':
                result = number1 + number2;
                System.out.print("Result : " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.print("Result : " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.print("Result : " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.print("Result : " + result);
                break;

            case '%':
                result = number1 % number2;
                System.out.print("Result : " + result);
                break;
            default:
                System.out.println("Invalid NUmber :");

        }

    }
}
