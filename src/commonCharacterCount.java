
/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[time limit] 3000ms (java)
[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ¡Â inputArray.length ¡Â 10,
1 ¡Â inputArray[i].length ¡Â 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.
*/

import java.util.Arrays;

public class commonCharacterCount {
    public static void main(String[] args) {
        String S1 = "aabcc";
        String S2 = "adcabac";

        System.out.println("1: commonCharacterCount is : " + commonCharacterCount(new StringBuilder(S1), new StringBuilder(S2)));
        System.out.println("2: commonCharacterCount is : " + commonCharacterCount(S1,S2));

    }

    private static int commonCharacterCount(StringBuilder S1, StringBuilder S2) {

        int counter = 0;
        for (int i=0; i< S1.length(); i++){
            System.out.println(" character At " + i + " = " + S1.charAt(i));
            for (int j=0; j< S2.length(); j++){
                if (S1.charAt(i) == S2.charAt(j)){
                    counter++;
                    S2.deleteCharAt(j);
                    System.out.println(" character match " + S2 + " - " + S1.charAt(i));
                    break;
                }
            }

        }

        return counter;
    }
    private static int commonCharacterCount(String S1, String S2) {

        char[] str1 = S1.toCharArray();
        char[] str2 = S2.toCharArray();
        int counter = 0;

        for (int i=0; i< str1.length; i++){
            System.out.println(" character At " + i + " = " + str1[i]);
            for (int j=0; j< str2.length; j++){
                if (str1[i] == str2[j]){
                    counter++;
                    str2[j] = ' ';
                    break;
                }
            }

        }

        return counter;
    }

}