package chebanAD181;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    Operations() { };

    //method for determining the string with an end to 'ed'
    public void stringAnalyse(String string) {
        String suffix = "ed";
        if(string.endsWith(suffix)) System.out.println("true");
        else System.out.println("false");
    }

    //method for summing all found numbers in the string
    public void stringAnalyseNumber(String string) {
        int sumNums = 0;
        for(int i = 0; i < string.length(); i++) {
            //isDigit - determining the number
            if (Character.isDigit(string.charAt(i))) {
                sumNums += Character.getNumericValue(string.charAt(i));
            }
        }
        System.out.println(sumNums);
    }

    //method for determining the maximum number of consecutive identical char's
    public void longestIndex(String string) {
        int ii = 1; //index the current maximum quantity(in process)
        int ctrl = 1; //index of the previous maximum quantity(in process)
        for(int i = 0; i < string.length() && i+1 !=string.length(); i++) {
            if(string.charAt(i) == string.charAt(i+1)) ii++;
            else {
                if(ctrl < ii ) ctrl = ii;
                ii = 1;
            }
            if(ctrl < ii) ctrl = ii;
        }
        System.out.println(ctrl);
    }

    //method for determining words in a string
    public void stringToWord(String string) {
        //split - method to splits a string around a regular expression
        String [] arrWords = string.split(" ");
        for(int i = 0; i < arrWords.length; i++) System.out.println(arrWords[i]);
    }

    //method for mixing char's in two lines alternately
    public void mixString(String string1, String string2) {
        int aLength = string1.length();
        int bLength = string2.length();
        int min = Math.min(aLength, bLength);
        //stringbuilder for editing string
        StringBuilder sb = new StringBuilder(aLength + bLength);
        for(int i = 0; i < min; i++) {
            sb.append(string1.charAt(i));//add char's[i] from string1 to string 'sb'
            sb.append(string2.charAt(i));//add char's[i] from string2 to string 'sb'
        }
        if (aLength > bLength) {
            sb.append(string1, bLength, aLength); //1-string, 2-offset, 3-count processed char's
        } else if (aLength < bLength) {
            sb.append(string2, aLength, bLength);
        }
        System.out.println(sb.toString());
    }
}
