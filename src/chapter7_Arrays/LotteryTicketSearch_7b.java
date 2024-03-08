package chapter7_Arrays;

import java.util.Arrays;
import java.util.Random;
// In this code we will make sure to create an Array with specific values created randomly
// within the "generateNumbers" method
public class LotteryTicketSearch_7b {

    public static final int LENGHT = 6;
    public static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket); // this will set all the values in an increasing way (used for binary search)
        printTicket(ticket);
    }
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGHT];
        Random randomValue = new Random();
        for (int i = 0; i<LENGHT; i++){
            int randomNumber ;

            /*
             Generate random number the search to make sure it doesn't
             already exist in the array.If it does regenerate and search again.
             */
            do{
               randomNumber = randomValue.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(sequentialSearch(ticket, randomNumber));
            ticket[i] = randomNumber;

        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor this is the value to search in the array
     * @return true if found, false if not
     */
    public static boolean sequentialSearch(int[] array, int numberToSearchFor){
        /*
        This is called an enhanced loop.
        it iterates through 'array' and each time assigns
        the current element to 'value'
        */
        for(int value: array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        //If we have reached this point, then the entire array was searched and the value was not found
        return false;
    }

    public static boolean binarySearch (int[] array, int numberToSearchFor){
        //Array is sorted first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0){
            return true;
        }else return false;
    }

    public static void printTicket(int[] ticket){
        for(int i=0; i<LENGHT; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
