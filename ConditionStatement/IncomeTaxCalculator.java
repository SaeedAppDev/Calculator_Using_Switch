package ConditionStatement;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary :");
        
        double salary = scanner.nextDouble();

        int tax;
        if (salary < 500000) {
            tax = (int) (salary * 0);
            System.out.println("Total tax :" + tax);
           
        } else if (salary >= 500000 && salary <= 1000000) {
            tax = (int) (salary * 20.0);
            System.out.println("Total Tax :" + tax);
        } else {
            tax = (int) (salary * 30.0);
            System.out.println("Total Tax :" + tax);
        }

    }

}
