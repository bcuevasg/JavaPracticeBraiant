package chapter3_if_else_switch;

import java.util.Scanner;

/*
 * IF-ELSE.
 * All salespeople are expected to make at least 10 sales each week
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator_If_Else_3b {
    public static void main(String[] args) {
        //Initialize Values we know
        int quota = 10;

        //Get Values we don't
        System.out.println("Enter the numbers of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a Decicion on the path to take - Output
        if(sales >= 10){ //since we we only have 1 statement for the IF, if we remove the curly braces from it will not affect
            System.out.println("Congratulations!!! you have met your quota.");
        }else {
            int salesShort = quota - sales;
            System.out.println("You did not met the quota U.U, you were short by: " + salesShort);
        }
    }
}
