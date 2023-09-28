package chapter3;

import java.util.Scanner;

/*
* Logical Operators
* To Qualify for a loan, a person must make at least $30,000 a year
* and have been working at their current job for at least 2 years
*/
public class LogialOperator_LoanQualifier {
    public static void main(String[] args) {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't
        System.out.println("How much do you make a year: ");
        Scanner scanner = new Scanner(System.in);
        double currentSalary = scanner.nextDouble();

        System.out.println("How long have you been at you current work: ");
        double currentYears = scanner.nextDouble();

        scanner.close();
        //Make deciscions NOTE: This is not recomended prefarably use other ways to do it
        if(currentSalary >= requiredSalary && currentYears >= requiredYearsEmployed){
                System.out.println("Congrats you qualify for the Loan.");
        } else{
            System.out.println("Sorry you must earn at least $"
                    + requiredSalary + " to qualify for the loan");
            }
    }
}
