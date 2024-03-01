package chapter3_if_else_switch;

import java.util.Scanner;
/*
IF Statement.
All sales people get a payment of $1000 a week
Salespeople who exceeded 10 sales get an additional bonus of $250
 */

public class SalaryCalculator_If {
    public static void main(String args[]){
        //Initialize Known value
        int weekSalary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee during the week?");
        Scanner scanner = new Scanner(System.in);
        int salesDone = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners.
        if(salesDone > quota){
            weekSalary += bonus;
        }
        //Output
        System.out.println("The pay for the employee is: $" + weekSalary);
    }

}
