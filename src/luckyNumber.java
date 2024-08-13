/*
Given a ticket number n, determine if it's lucky or not.
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
Example

        For n = 1230, the output should be
isLucky(n) = true;
        For n = 239017, the output should be
isLucky(n) = false.
Input/Output
*/

public class luckyNumber {
    public static void main(String[] args) {
        int luckyNumber = 4563;

        System.out.println("Is Lucky number: " + isLuckyNumber(luckyNumber));

    }

    private static boolean isLuckyNumber(int luckyNumber) {
        int sum = 0;
        //int sumSecondPart=0;
        String LuckyNnumberString = String.valueOf(luckyNumber);

        for(int i=0;i<(LuckyNnumberString.length()/2);i++){
                sum += LuckyNnumberString.charAt(i) - LuckyNnumberString.charAt(LuckyNnumberString.length()-1-i);
        }

        return sum == 0;
    }
}