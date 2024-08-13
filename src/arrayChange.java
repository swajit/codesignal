
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayChange {
    public static void main(String[] args) {
        int[] arry = {4,6,2,1};
        System.out.println("1: increasing array is : " + arrayChange(arry));
    }

    private static int arrayChange(int[] arry) {
        int value = 0;

        for (int i=1; i< arry.length; i++) {
            if (arry[i] < arry[i-1]) {
                value += arry[i-1]+1 - arry[i];
                arry[i] = arry[i-1]+1;
            }
        }
        System.out.println(" Final Array is " + Arrays.toString(arry));
        return value;
    }

}