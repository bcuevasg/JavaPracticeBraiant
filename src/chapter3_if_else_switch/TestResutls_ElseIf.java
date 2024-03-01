package chapter3_if_else_switch;

import java.util.Scanner;

public class TestResutls_ElseIf {
    public static void main(String[] args) {
        //Get the test score from user
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double userScore = scanner.nextDouble();

        //Determine the letter grade
        char grade;
        if(userScore < 60){
            grade = 'F';
        } else if (userScore < 70) {
            grade = 'D';
        } else if (userScore < 80) {
            grade = 'C';
        } else if (userScore < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("You score is: " + grade);
    }
}
