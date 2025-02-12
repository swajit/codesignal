import java.util.Arrays;

/**
 After becoming famous, CodeBots decided to move to a new building and live together. The building is represented by a rectangular matrix of rooms, each cell containing an integer - the price of the room. Some rooms are free (their cost is 0), but that's probably because they are haunted, so all the bots are afraid of them. That is why any room that is free or is located anywhere below a free room in the same column is not considered suitable for the bots.

 Help the bots calculate the total price of all the rooms that are suitable for them.

 Example

 For

 matrix = [[0, 1, 1, 2],
 [0, 5, 0, 0],
 [2, 0, 3, 3]]
 the output should be
 matrixElementsSum(matrix) = 9.

 Here's the rooms matrix with unsuitable rooms marked with 'x':

 [[x, 1, 1, 2],
 [x, 5, x, x],
 [x, x, x, x]]
 Thus, the answer is 1 + 5 + 1 + 2 = 9.

 Input/Output

 [time limit] 3000ms (java)
 [input] array.array.integer matrix

 2-dimensional array of integers representing a rectangular matrix of the building.

 Constraints:
 1 ≤ matrix.length ≤ 5,
 1 ≤ matrix[i].length ≤ 5,
 0 ≤ matrix[i][j] ≤ 10.

 [output] integer
 */
public class MatrixBlurBox {
    public static void main(String[] args) {
        int[][] matrix =    {{1,1,1},
                            {1,7,1},
                            {1,1,1}};
        int[][] output = solution(matrix);


        for(int[] i:output){
            System.out.println(Arrays.toString(i));
        }

    }

    private static int[][] solution(int[][] image) {
        int maxRow = image.length;
        int maxCol = image[0].length;
        int[][] output = new int[maxRow-2][maxCol-2];

        //3X3 = center[1][1]
        //4X4 = Centers are 1,1 - 1,2 - 2,1 - 2,2
        //4X3 = 1,1 - 2,1
        for (int i=0; i < maxRow; i++){
            for (int j=0; j < maxCol; j++){
                if (i ==0 || j ==0) {
                    continue;
                }
                if((i < maxRow-1) && (j < maxCol-1)){
                    System.out.println( "I value - " + i + " J value - " + j );
                    output[i-1][j-1] =  image[i-1][j-1] + image[i-1][j] + image[i-1][j+1] +
                            image[i][j-1] + image[i][j] +   image[i][j+1] +
                            image[i+1][j-1] + image[i+1][j] + image[i+1][j+1];
                }
            }
        }

        return output;
    }

}