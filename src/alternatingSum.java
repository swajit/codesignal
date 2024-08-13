
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

public class alternatingSum {
    public static void main(String[] args) {
        int[] people = {50, 60, 60, 48, 80}; //expected output alternatingSums(a) = [180, 105]

        System.out.println("1: alternatingSum array is : " + Arrays.toString(alternatingSum(people)));
        System.out.println("1: alternatingSum array is : " + Arrays.toString(alternatingSum2(people)));
    }

    private static int[] alternatingSum(int[] people) {
        int[] peopleSum = {0,0};
        boolean flag = true;
        for (int height:people){
            if(flag){
                peopleSum[0] += height;
            }else{
                peopleSum[1] += height;
            }
            flag = !flag;
        }

        return peopleSum;
    }

    private static int[] alternatingSum2(int[] people) {
        int[] peopleSum = {0,0};
        for (int i=0; i< people.length; i++){
            if(i % 2 == 0){
                peopleSum[0] += people[i];
            }else{
                peopleSum[1] += people[i];
            }
        }

        return peopleSum;
    }
}