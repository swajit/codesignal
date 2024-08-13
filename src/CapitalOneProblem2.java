import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CapitalOneProblem2 {
    
    
    public static void main(String[] args) {
        CapitalOneProblem2 sol = new CapitalOneProblem2();
        int[] forest = {25,0,50,0,0,0,0,15,0,0,45}; // expected answer {7,2,10}
        int window = 4;
        System.out.println(Arrays.toString(sol.CapitalOneProblem2(forest, window))); // Expected output: 2
    }

    private int[] CapitalOneProblem2(int[] forest, int bird) {
        int n = forest.length;
        ArrayList<Integer> result = new ArrayList<>();

        if (forest[bird] >= bird) {
            int sum = forest[bird];
            result.add(bird);
        }

        int sum = 0;
        boolean right = true;
        int pointer = bird;
        while (sum <= 100) {
            if (right) {
                pointer++;
                if (forest[pointer] >= bird) {
                    sum += forest[pointer];
                    result.add(pointer);
                    forest[pointer] = 0;
                    right = !right;
                    pointer = bird;
                }
            } else {
                pointer--;
                if (forest[pointer] >= bird) {
                    sum += forest[pointer];
                    result.add(pointer);
                    forest[pointer] = 0;
                    right = !right;
                    pointer = bird;
                }
            }

        }
        int[] resultsArry = result.stream().mapToInt(i -> i).toArray();
        return resultsArry;
    }
}
