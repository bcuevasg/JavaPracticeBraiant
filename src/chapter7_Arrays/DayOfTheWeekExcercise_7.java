package chapter7_Arrays;

import java.util.Scanner;

public class DayOfTheWeekExcercise_7 {

    public static final String[] daysOfTheWeek ={"Monday","Tuesday","Wednesday",
    "Thursday", "Friday", "Saturday", "Sunday"};
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Insert the number of the day to see:");
        int dayToSee = scanner.nextInt();
        getDayOfWeek(dayToSee);

    }
    public static void getDayOfWeek(int dayToSee){
        if(dayToSee > daysOfTheWeek.length || dayToSee <= 0){
            System.out.println("The value inserted is does not belong to a day of the week");
        }else {
            System.out.println(daysOfTheWeek[dayToSee - 1]);
        }
    }
}
