
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

import java.util.*;

public class sortByHeight {
    public static void main(String[] args) {
        int[] people = {-1, 150, 190, 170, -1, -1, 160, 140};
        System.out.println("1: sortByHeight array is : " + Arrays.toString(sortByHeight(people)));
    }

    private static int[] sortByHeight(int[] people) {
        //int[] sortedPeople = people.clone();
        //Arrays.sort(sortedPeople);

        List<Integer> sortedPeople = new ArrayList<>();
        for (int height:people){
            if(height != -1){
                sortedPeople.add(height);
            }
        }
//        sortedPeople.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
        Collections.sort(sortedPeople);
        System.out.println("1: sortByHeight array is : " + sortedPeople.toString());


        int index = 0;
        for (int i=0; i< people.length; i++) {
            System.out.println(" character At " + i + " = " + people[i]);
            if (people[i] != -1) {
                people[i] = sortedPeople.get(index++);
            }
        }
        return people;
    }

}