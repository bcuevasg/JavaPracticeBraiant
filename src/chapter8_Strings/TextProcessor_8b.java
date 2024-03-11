package chapter8_Strings;

public class TextProcessor_8b {
    public static void main(String[] args) {
        //countWords("I love Test Automation University");
        //reverseText("Hello TAU!");
        addSpaces("ThisIsSomethingNewToAddSpaces");
    }

    /**
     * Split a String into an array by tokenizing it.
     * Counts words and prings them
     * @param text Full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("You text containts %d words:", numberOfWords);
        System.out.println(message);

        for(int i=0; i<numberOfWords;i++){
            System.out.println(words[i]);
        }
    }

    /**
     * This Method makes sure to reverse te text provided
     * @param textToReverse value to be reversed
     */
    public static void reverseText(String textToReverse ){
        int textLenght = textToReverse.length();
        for (int f = (textLenght -1); f >= 0; f--){
            System.out.print(textToReverse.charAt(f));//No use [] use chaAt instead since is a string
        }
    }

    /**
     * Adds spaces before each uppercase leter
     * @param text
     */
    public static void addSpaces(String text){
        var mofifiedText = new StringBuilder(text);
        for (int i = 0; i < mofifiedText.length(); i++){
            if (i != 0 && Character.isUpperCase(mofifiedText.charAt(i))){
                mofifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(mofifiedText);
    }
}
