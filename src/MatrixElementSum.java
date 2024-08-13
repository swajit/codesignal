
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
public class MatrixElementSum {
    public static void main(String[] args) {
        int[][] matrix =    {{0, 1,1 , 2},
                            {0, 5, 0, 0},
                            {2, 0, 3, 3}};

        System.out.println("Result: " + matrixElementsSum(matrix));

    }

    private static int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        for (int col = 0; col < matrix[0].length; col++){
            for (int row = 0; row < matrix.length; row++){
                  if (matrix[row][col] == 0)
                        break;

                  sum += matrix[row][col];
            }

        }
        return sum;
    }
}