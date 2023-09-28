package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculatorRedo = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculatorRedo.getRoom();
        Rectangle bathroom = calculatorRedo.getRoom();
        calculatorRedo.scanner.close();

        double area = calculatorRedo.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is " + area);
    }


    public Rectangle getRoom(){

        System.out.println("Please enter the Lenght of your room");
        double lenght = scanner.nextDouble();

        System.out.println("Enter the width of your room");
        double width = scanner.nextDouble();

        return new Rectangle(lenght, width);
    }

    public double calculateTotalArea(Rectangle rect1, Rectangle rect2){
        double area = rect1.calculateArea() + rect2.calculateArea();
        return  area;
    }

}

