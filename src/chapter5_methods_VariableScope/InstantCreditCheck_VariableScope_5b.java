package chapter5_methods_VariableScope;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes ore than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck_VariableScope_5b {
    //Initialize what we know
    static int requireSalary = 25000;
    static int requiredCreditScore = 700;

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        //Get what we don't know
        double salary = getUserSalary();
        int creditScore = getUserCreditScore();
        scanner.close();
        //Check if user is qualified
        boolean qualified = isUserQualified(salary,creditScore);
        //Notify the user
        notifyUser(qualified);
    }

    public static double getUserSalary(){
        System.out.println("Enter you salary:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getUserCreditScore() {
        System.out.println("Enter you Credit Score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore){
        if(creditScore >= requiredCreditScore && salary >= requireSalary) {
            return true;
        }else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualided){
        if(isQualided){
            System.out.println("Congrats!! you have been approved");
        }else {
            System.out.println("Sorry. You have been declined");
        }
    }

}
