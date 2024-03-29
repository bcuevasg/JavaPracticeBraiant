package chapter4_loops;

import java.util.Scanner;

/*
 *FOR LOOP
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier_For_4c {
    public static void main(String[] args) {
        //Get the number of items to scan
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        //Create loop to iterate through all of the items and accumulate the costs
        for(int i = 0; i < quantity; i++){
            System.out.println("Enter the cost of the item");
            double price = scanner.nextDouble();

            total += price;
        }
        scanner.close();
        System.out.println("The total is price is $" + total);
    }
}
