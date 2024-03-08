package chapter7_Arrays;

import java.util.Scanner;
/*
 * Create a program that allow a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 *
 */
public class Grades_7c {
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades wouild you like to enter:");
        grades = new int[scanner.nextInt()];
        getGrades();
        scanner.close();
        System.out.println("Average: " + String.format("%.2f",calculateAVG()));
        System.out.println("Highest value is: " + String.format("%d",getHighest()));
        System.out.println("Lowest value is: " + String.format("%d",getLowest()));
    }

    public static void getGrades(){
        for(int i = 0; i<grades.length; i++){
            System.out.println("Enter Grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int CalculateSum(){
        int sum = 0;
        for (int grade: grades){
            sum += grade;
        }
        return sum;
    }

    public static double calculateAVG(){
        return CalculateSum() / grades.length;
    }

    public static int getHighest(){
        int highest = grades[0];
        for(int grade: grades){
            if (grade > highest){
                highest = grade;

            }
        }
        return highest;
    }
    public static int getLowest(){
        int lowest = grades[0];
        for(int grade: grades){
            if (grade < lowest){
                lowest = grade;

            }
        }
        return lowest;
    }
}
