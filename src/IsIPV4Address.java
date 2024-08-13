
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

public class IsIPV4Address {
    public static void main(String[] args) {
        String input = "192.168.01.1";
        boolean result = isIPv4Address(input);
        System.out.println("The input string is a IPV4 Address : " + result); // Expected output: true
    }

    private static boolean isIPv4Address(String str) {

        String[] segments = str.split("\\.");
        if (segments.length != 4)
            return false;

        /*
        250 - 255     25[0-5]
        200 - 249     2[0-4][0-9]
        100 - 199     1[0-9][0-9]
        10 - 99       [1-9][0-9]
        0 - 9         [0-9]
        */

        String pattern = "[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]";
        for (String Seg:segments){
            if (!Seg.matches(pattern))
                    return false;
        }

        return true;
    }

}