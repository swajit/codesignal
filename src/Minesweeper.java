import java.sql.SQLOutput;
import java.util.Arrays;

public class Minesweeper {
    int[][] solution(boolean[][] matrix) {
        int rowCnt = matrix.length;
        int colCnt = matrix[0].length;
        int[][] output= new int[rowCnt][colCnt];

        for(int row=0; row< rowCnt; row++){
            for(int col=0; col<colCnt; col++){
                System.out.println("Values for " + row+ " - " +col);
                output[row][col] = countMines(matrix, row, col);
                System.out.println("-----");

            }
        }

        return output;

    }

    public static int countMines(boolean[][] mat, int row, int col){
        int minesCount = 0;

    /*
    ul = row-1  col-1
    um = row-1  col
    ur = row -1 col + 1
    ml = row  col-1
    mm = row  col
    mr = row  col+1
    ll = row + 1   col-1
    lm = row + 1   col
    lr = row + 1   col + 1

    rowL = if
    rowU
    colL
    colU
   */
//        String s="Swajit";
//        char[] = s.toCharArray();
        int rowL = Math.max(row - 1, 0);
        int rowU = Math.min(row + 1, mat.length - 1);
        int colL = Math.max(col - 1, 0);
        int colU = Math.min(col + 1, mat[0].length - 1);

        System.out.println( "Inner lopp values " + rowL +" - "+ rowU +" | " + colL +" - "+ colU );

        for(int j=rowL; j<=rowU; j++){
            for(int k=colL; k <=colU; k++){
                if (mat[j][k] && (!(j == row && k == col))){
                    System.out.print( j +" - "+ k +" | ");
                    minesCount ++;
                }
            }
        }
        System.out.println("");

        return minesCount;
    }

    public static void main(String[] args) {
        Minesweeper m = new Minesweeper();
        boolean[][] bull = new boolean[3][3];

        bull[0] = new boolean[]{true, false, false};
        bull[1] = new boolean[]{false, true, false};
        bull[2] = new boolean[]{false, false, false};

        int[][] i = m.solution(bull);
        for(int[] row: i){
            System.out.println(Arrays.toString(row));
        }

    }
}
