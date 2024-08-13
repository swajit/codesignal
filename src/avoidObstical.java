
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

public class avoidObstical {
    public static void main(String[] args) {
        int[] inputArray = {5, 3, 6, 7, 9};
        int result = avoidObstacles(inputArray);
       //System.out.println(result); // Expected output: 4

        System.out.println("The magic min number is : " + result); //// Expected output: 4
    }

    private static int avoidObstacles(int[] inputArray) {

        int jump = 2;

        for (int i=0; i<inputArray.length; i++){
            System.out.println(" I values "+i+" jump value " + jump + " input value number " + inputArray[i] + " Mod is " +inputArray[i] % jump);
            if(inputArray[i] % jump == 0){
                i=-1; //this is -ve 1 because the for loop starts with i++
                jump++;
            }
        }
        return jump;
    }

}