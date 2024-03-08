package chapter7_Arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket_7a {
    public static final int LENGHT = 6;
    public static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGHT];
        Random randomValue = new Random();
        for (int i = 0; i<LENGHT; i++){
            ticket[i] = randomValue.nextInt(MAX_TICKET_NUMBER) + 1;

        }
        return ticket;
    }

    public static void printTicket(int[] ticket){
        for(int i= 0; i<LENGHT; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
