
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

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearrangingIntArray {
    public static void main(String[] args) {
        String str = "aaccddrtbb";
        System.out.println("The input string is a palindrome : " + palindromeRearranging(str));
    }

    private static boolean palindromeRearranging(String str) {
        int value = 0;

        //for(char alpha='a';alpha <='z';alpha++)
        //    System.out.println(alpha-'a' + " for alphabet : " + alpha);

        int[] alphabetCounter = new int[26]; // solution without hashmap

        char[] cStr = str.toCharArray();
        for (int i=0; i< cStr.length; i++) {
            alphabetCounter[cStr[i]-'a']++;
        }
        int counter = 0;
        for(int i:alphabetCounter){
            if (i % 2 != 0){
                counter++;
            }
        }

        return counter <= 1;
    }

}