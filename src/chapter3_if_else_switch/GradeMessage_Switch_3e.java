package chapter3_if_else_switch;

import java.util.Scanner;

public class GradeMessage_Switch_3e {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;
        switch (grade){
            case "A":
                message = "Excelent Job";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!!";
                break;
            default:
                message = "Error. Invalid Grade";
        }

        System.out.println(message);

        /* using lambdas
            String message = switch (grade) {

            case "A" -> "Excelent Job";
            case "B" -> "Great job";
            case "C" -> "Good job";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!!";
            default -> "Error. Invalid Grade";
        };*/

    }
}
