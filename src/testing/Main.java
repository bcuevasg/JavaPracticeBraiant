package testing;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        // Press Opt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!\n");
//
//        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("i = " + i);
//        }
// Handling Strings and some methods to work with them
//        String logLine = "[ERROR]: Invalid operation\r\n";
//        String[] arrLogLine = logLine.split(": ",2);
//        System.out.println(arrLogLine[1]);
//
//        String levelValue = arrLogLine[0].replace("[", "").replace("]","").toLowerCase();
//        System.out.println(levelValue);
//        String levelValue2 = arrLogLine[0].replace("[", "(").replace("]",")").toLowerCase();
//        System.out.println(levelValue);
//        String reformatMessage = arrLogLine[1].trim() + " " + levelValue2;
//        System.out.println(reformatMessage);



//        String identifier = "My  Id";
//        char[] ch = identifier.toCharArray();
//        StringBuilder textChanged = new StringBuilder();
//        for(int i = 0; i<identifier.length();i++){
//             if(ch[i] == ' '){
//                 ch[i] = '_';
//                 textChanged.append(ch[i]);
//             }else {
//                 textChanged.append(ch[i]);
//             }
//        }
//        textChanged.toString();
//        System.out.println(textChanged);

    String variable = "avacado";
        System.out.print("variable".split("a").length);


    }
}