package chapter6_objects_classes;

import java.util.Scanner;

public class HomeAreaCalculatorRedo_6c {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculatorRedo_6c calculatorRedo = new HomeAreaCalculatorRedo_6c();

        Rectangle_6a kitchen = calculatorRedo.getRoom();
        Rectangle_6a bathroom = calculatorRedo.getRoom();
        calculatorRedo.scanner.close();

        double area = calculatorRedo.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is " + area);
    }


    public Rectangle_6a getRoom(){

        System.out.println("Please enter the Lenght of your room");
        double lenght = scanner.nextDouble();

        System.out.println("Enter the width of your room");
        double width = scanner.nextDouble();

        return new Rectangle_6a(lenght, width);
    }

    public double calculateTotalArea(Rectangle_6a rect1, Rectangle_6a rect2){
        double area = rect1.calculateArea() + rect2.calculateArea();
        return  area;
    }

}

