import java.lang.reflect.Array;
import java.util.Arrays;

/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[time limit] 3000ms (java)
[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ¡Â picture.length ¡Â 5,
1 ¡Â picture[i].length ¡Â 5.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.
*/
public class MatrixAddBorder {
    public static void main(String[] args) {
        String[] picture = {"abcd","deda"};

        System.out.println("Result: " + Arrays.toString(MatrixAddBorder(picture)));

    }

    private static String[] MatrixAddBorder(String[] picture) {

        String[] outputPicture = new String[picture.length+2];

        int pictureLength = picture[0].length() + 2;
        StringBuilder borderString = new StringBuilder();

        for (int i=0; i<pictureLength; i++) {
            borderString.append("*");
        }
        outputPicture[0] = borderString.toString();
        outputPicture[picture.length+1] = borderString.toString();

        for(int i=0; i<picture.length; i++ ){
            outputPicture[i+1] = "*"+picture[i]+"*";
        }

        return outputPicture;
    }
}