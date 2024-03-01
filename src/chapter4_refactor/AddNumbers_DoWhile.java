package chapter4_refactor;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers.The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Please add you first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Please add you second number:");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum of the 2 numbers is: " + sum);
            System.out.println("Would you like to run this again? true or false");
            again = scanner.nextBoolean();
        } while(again);
        scanner.close();
    }
}
