package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        //1. Get the number of hours worked.
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hoursWordked = scanner.nextInt();


        //2. Get the hourly pay rate
        System.out.println("Enter the the pay rate from the employee's");
        double payRate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate

        double grossPay = hoursWordked * payRate;

        //4. Display resutlts
        System.out.println("The payment is: " + grossPay);



    }
}
