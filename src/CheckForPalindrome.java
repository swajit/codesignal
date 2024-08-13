import java.util.Scanner;

public class CheckForPalindrome {
    public static Scanner kbinput= new Scanner (System.in);
    public static void main(String[] args){
        System.out.println("Hello please enter the String : ");
        String word = kbinput.next();

        System.out.println("The word " + word + " is a palindrome using loop: " + isPalindrome2(word));
//        System.out.println("The word " + word + " is a palindrome using String Buffer: " + isPaliandromeStringBuilder(word));
//        String reversedString = reverseRecursively(word);
//        System.out.println("The word " + word + " is a reverse using recursion : " + reversedString);
    }

    private static boolean isPalindromeStringBuilder(String word) {
        StringBuilder sb = new StringBuilder(word);
        return word.equals(sb.reverse().toString());
    }

    private static boolean isPalindrome(String word) {
        //output string
        String reverse = "";
        char[] wordCharArray= word.toCharArray();
        for (int i=wordCharArray.length-1; i >= 0; i--){
            reverse += wordCharArray[i];
        }
        return word.equals(reverse);
    }

    private static boolean isPalindrome2(String word) {
        //output string
        //String reverse = "";
        //char[] wordCharArray= word.toCharArray();
        for (int i=0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static String reverseRecursively(String str) {
        System.out.println(str);
        if (str.isEmpty()) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
}
