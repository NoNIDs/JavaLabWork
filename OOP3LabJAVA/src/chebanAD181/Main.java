package chebanAD181;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Operations operations =  new Operations();

        //System.out.println("Enter string: ");
       // String string = scanner.nextLine();

        System.out.println("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String string2 = scanner.nextLine();

        //Call method (stringAnalyse, stringAnalyseNumber, longestIndex. stringToWord, mixString)
        operations.mixString(string1, string2);
    }
}
