package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 *  Search a String to determine if it contains the letter 'A'.
 */
public class LetterSearch_ForBreak {
    public static void main(String[] args) {
        //Get Text
        System.out.println("Enter Some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();//next() only identifies a word for a line use nextLine()
        scanner.close();
        //Search text for letter A

        boolean letterFound = false;
        for(int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("This text contains the letter 'A'");
        }else {
            System.out.println("This text does not contain the letter 'A'");
        }

    }
}
