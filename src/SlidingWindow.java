import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SlidingWindow {
    
    
    public static void main(String[] args) {
        SlidingWindow sol = new SlidingWindow();
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int window = 3;
        System.out.println(Arrays.toString(sol.negativeNumbers(arr, window))); // Expected output: 2
    }

    private int[] negativeNumbers(int[] arr, int w) {
        int n = arr.length;
        int[] result = new int[n-w+1];
        Queue<Integer> q = new LinkedList<Integer>();
        //Since it is first -ve number we can use FIFO Queue to store


        //Calculate the first window and first -ve number
        for(int i=0; i<w; i++){
            if(arr[i] <0){
                q.add(arr[i]);
                }
        }
        result[0] = q.isEmpty()?0:q.peek();

        // Loop through the rest of the windows and calulate the -ve number for each window
        for(int j= 1; j < n-w+1; j++){
            if(arr[j-1]<0) {
                q.poll();
            }
            if(arr[j+w-1]<0) {
                q.add(arr[j+w-1]);
            }
            //after every iteration store the results in n
            result[j] = q.isEmpty()?0:q.peek();
        }
        return result;
    }
}
