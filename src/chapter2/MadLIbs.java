package chapter2;

import java.util.Scanner;

public class MadLIbs {
    //This example we will create a program that will take 3 variables
    //The variables will be Season, Number and Adjective
    //Once this variables are added print them in the next string
    //"On a [adjetive] [season] day,I dring a minimum of [number] cups of coffe"
    public static void main(String arg[]){
        //1. We get the season
        System.out.println("Please give me an Adjetive: ");
        Scanner scanner = new Scanner(System.in);
        String adjetive = scanner.next();

        //2. We get the Season of the yer:
        System.out.println("What season of the year you like the most?: ");
        String seasonOfTheYear = scanner.next();

        //3. We get the number to use:
        System.out.println("What number do you like?: ");
        int numberToUse = scanner.nextInt();
        scanner.close();

        //4. We print the message
        System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee"
                , adjetive, seasonOfTheYear, numberToUse);
    }
}
