
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
import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {
    public static void main(String[] args) {
        String str = "aaccddrbb";
        System.out.println("The input string is a palindrome : " + palindromeRearranging(str));
    }

    private static boolean palindromeRearranging(String str) {
        int value = 0;

        Map<Character,Integer> charCount = new HashMap<>();
        char[] cStr = str.toCharArray();
        for (int i=0; i< cStr.length; i++) {
            if (charCount.containsKey(cStr[i])){
                charCount.put(cStr[i], charCount.get(cStr[i])+1);
            }else {
                charCount.put(cStr[i], 1);
            }
        }
        int counter = 0;
        for(char c:charCount.keySet()){
            if (charCount.get(c) % 2 != 0){
                counter++;
            }
        }

        return counter <= 1;
    }

}