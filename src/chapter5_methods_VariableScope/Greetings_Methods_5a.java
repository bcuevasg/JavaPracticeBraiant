package chapter5_methods_VariableScope;

import java.util.Scanner;

/*
 *OUR FIRST METHOD
 * Write a method that ask a user for their name, then greets them by name.
 */
public class Greetings_Methods_5a {
    public static void main(String[] args) {
        System.out.println("Pleas enter you name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        greetUser(name);


    }

    public static void greetUser(String name){
        System.out.println("Hi there,  "+ name);
    }
}
