/*
	Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

	Example

	For inputArray = [3, 6, -2, -5, 7, 3], the output should be
	adjacentElementsProduct(inputArray) = 21.

	7 and 3 produce the largest product.

	Input/Output

	[time limit] 3000ms (java)
	[input] array.integer inputArray

	An array of integers containing at least two elements.

	Guaranteed constraints:
	2 ¡Â inputArray.length ¡Â 10,
	-1000 ¡Â inputArray[i] ¡Â 1000.

	[output] integer

	The largest product of adjacent elements.
 */

import java.util.Arrays;

public class AdjLargestProduct {
    public static void main(String[] args){
        int[] integerArray = {3,6,-2,-5,7,3,20,2,50};
        System.out.println("1: Largest product of adjecent integer = " + adjecentElementsProduct(integerArray) + " for array length "+ integerArray.length);
        System.out.println("2: Largest product of adjecent integer = " + adjecentElementsProduct2(integerArray) + " for array length "+ integerArray.length);
        System.out.println("3: Largest product of adjecent integer = " + adjecentElementsProductRecursive(integerArray,0) + " for array length "+ integerArray.length);
    }

    private static int adjecentElementsProduct(int[] integerArray) {

        if (integerArray.length < 2){
            throw new IllegalArgumentException("The number of elements less than expected");
        }

       int largestProduct = integerArray[0] * integerArray[1] ;
       int intProduct;

       for (int i=1; i< integerArray.length-1; i++){
           intProduct = integerArray[i]*integerArray[i+1];
           if (intProduct > largestProduct){
               largestProduct = intProduct;
           }
       }
        return largestProduct;
    }

    private static int adjecentElementsProduct2(int[] integerArray) {

        if (integerArray.length < 2){
            throw new IllegalArgumentException("The number of elements less than expected");
        }

        int largestProduct = integerArray[0];
        int intProduct;

        for (int i=0; i< integerArray.length-1; i++){
            intProduct = integerArray[i]*integerArray[i+1];

            largestProduct = Math.max(intProduct,largestProduct);

        }
        return largestProduct;
    }

    public static int adjecentElementsProductRecursive(int[] numbers, int index) {
        // Base case: if we reach the second last element, return the product of the last two elements
        if (index == numbers.length - 2) {
            System.out.println("base case reached: " + numbers[index] * numbers[index + 1]);
            return numbers[index] * numbers[index + 1];
        }
        System.out.println(Arrays.toString(numbers) + "  with Index value " + index);

        // Calculate the product of the current pair of adjacent elements
        int currentProduct = numbers[index] * numbers[index + 1];

        // Recursively find the maximum product in the rest of the array
        int maxProductInRest = adjecentElementsProductRecursive(numbers, index + 1);
        System.out.println("Current product :" +currentProduct +" Max Product :" + maxProductInRest);
        // Return the maximum of the current product and the maximum product from the rest of the array
        return Math.max(currentProduct, maxProductInRest);
    }
}
