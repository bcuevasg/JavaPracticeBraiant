package chapter3;

import java.util.Scanner;

public class AssignmentC3 {
    public static void main(String[] args) {
        // What do I know
        double pennies = 0.01;
        double nickels = 0.05;
        double dimes =   0.10;
        double quarter = 0.25;
        double dollar = 1.00;
        double difference ;
        String messageToPrint = "";
        // What I need to ask
        System.out.println("How many Pennies you have?");
        Scanner scanner = new Scanner(System.in);
        int userPennies = scanner.nextInt();



        System.out.println("How many Nickles you have?");
        int userNickles = scanner.nextInt();
        System.out.println("How many Dimes you have?");
        int userDimes = scanner.nextInt();
        System.out.println("How many Quarters you have?");
        int userQuarters = scanner.nextInt();

        scanner.close();
        double totalMoney = (userPennies * pennies) + (userNickles * nickels)
                + (userDimes * dimes) + (userQuarters * quarter);

        //Logic
        if(totalMoney == dollar){
            messageToPrint = "You won yuo have exactly $1 Dollar";
        } else if (totalMoney < dollar) {
            difference = dollar - totalMoney;
            messageToPrint = "You are UNDER by " + difference + " cents.";
        } else if (totalMoney > dollar) {
            difference = totalMoney - dollar;
            messageToPrint = "You are OVER by " + difference + " cents.";
        }
        System.out.println(messageToPrint);

    }
}
