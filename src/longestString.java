
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

public class longestString {
    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};

        System.out.println("Output Array is : " + Arrays.toString(longestString(inputArray)));

    }

    private static String[] longestString(String[] inputArray) {

        int maxLengthString = 0;
        int counter = 0;
        int index = 0;
        if(inputArray.length < 1) return inputArray;

        for(int i=0;i<inputArray.length;i++){
            if (inputArray[i].length() > maxLengthString ){
                maxLengthString = inputArray[i].length();
                counter = 0;
            }
            if (maxLengthString == inputArray[i].length())
                counter++;
        }
        String[] outputArray = new String[counter];
        System.out.println("MaxLength is : " + maxLengthString + " counter is :   " + counter);

        for(int i=0;i<inputArray.length;i++){
            if (inputArray[i].length() == maxLengthString ){
                outputArray[index] = inputArray[i];
                index++;
            }
        }
        return outputArray;
    }
}