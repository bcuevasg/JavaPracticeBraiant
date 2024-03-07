package chapter5_methods_VariableScope;

import java.util.Scanner;

public class PhoneBillExcercice_Exercise5 {
    //What do we know
    static double costOver = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    //Insert data From  user plan and overage minutes.
        double planPrice = getPlanPrice();
        int extraMinutes = getMinutesOver();
        scanner.close();
        double extraTimeCost = extraMinutesCalc(extraMinutes);
        double taxValue = taxCost(planPrice, extraTimeCost);
        itemizedBill(planPrice, extraTimeCost, taxValue);
    }

    public static double getPlanPrice(){
        System.out.println("Enter base cost of the plan:");
        double planPrice = scanner.nextDouble();
        return planPrice;
    }
    public static int getMinutesOver(){
        System.out.println("Enter Overage Minutes:");
        int minutesOver = scanner.nextInt();
        return minutesOver;
    }

    public static double extraMinutesCalc(int extraMinutes){
        double extraCost = extraMinutes * costOver;
        return extraCost;
    }

    public static double taxCost(double planPrice, double extraCost){
        double taxValue = (planPrice + extraCost) * taxRate;
        return taxValue;
    }

    public static void itemizedBill(double planPrice, double extraMinutesCost, double taxValue){
        double total = planPrice + extraMinutesCost + taxValue;
        System.out.printf("Phone Bill Statement\n" +
                "Plan: $%.2f\n" +
                "Overage: $%.2f\n" +
                "Tax: $%.2f\n" +
                "Total: $%.2f\n" ,
                planPrice, extraMinutesCost,taxValue,total);
    }
}
