package ConditionStatement;
import java.util.Scanner;

public class if_else {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter your age :");

    // byte age = scanner.nextByte();

    // if (age > 18) {
    //     System.out.println("Adult :");
    // }else{
    //     System.out.println("Not Adult :");
    // }
        System.out.println("Enter your number:");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
        System.out.println("Even :");
                    }else{
        System.out.println("odd");
    }
    
}
    
}