
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

import java.util.Stack;

public class reverseParentheses {
    public static void main(String[] args) {
        //String S1 = "a(bc)de";
        String S1 = "foo(bar(ba(123)z))bl(45)im"; //-- foobazrabblim
        System.out.println("1: reverseParentheses is : " + reverseParentheses(S1));
        System.out.println("2: reverseParentheses is : " + reverseParentheses2(S1));
    }

    private static String reverseParentheses(String S1) {

        StringBuilder outputString = new StringBuilder(S1);
        Stack<Integer> stack = new Stack<>();
        StringBuilder insideString = new StringBuilder();

        for (int i = 0; i < outputString.length(); i++) {
            System.out.println(" character At " + i + " = " + outputString.charAt(i));
            if (outputString.charAt(i) == '(') {
                stack.push(i);
            } else if (outputString.charAt(i) == ')') {
                int start = stack.pop(); // Pop the index of the matching '('
                int end = i;
                reverseSubstring(outputString, start + 1, end - 1); // Reverse the substring within the parentheses
                // Remove the parentheses after reversing
                outputString.deleteCharAt(end);
                outputString.deleteCharAt(start);
                i -= 2; // Adjust the index due to deletion of two characters
            }
        }
        return outputString.toString();
    }

    private static void reverseSubstring(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    private static String reverseParentheses2(String s) {
        int firstIndex = 0, secondIndex = 0;

        while (s.contains("(")){

//            s = s.replace("("+s.substring(s.lastIndexOf("(")+1, s.indexOf(")", s.lastIndexOf("(")))+")",
//                    new StringBuffer(s.substring(s.lastIndexOf("(")+1, s.indexOf(")", s.lastIndexOf("(")))).reverse().toString());
            int a = s.lastIndexOf("(")+1;
            int b = s.indexOf(")", s.lastIndexOf("("));


            s = s.replace("("+s.substring(a,b)+")", new StringBuilder(s.substring(a,b)).reverse().toString());

        }
        return s;
    }

 }
