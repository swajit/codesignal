import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class negativeNumberSlidingWindow {
        public int[] negativeNumbers(int[] arr, int window) {
            //initialized the parmeters I will use queue to store the -ve numbers
            int n = arr.length;
            int[] results = new int[n-window+1];
            Queue<Integer> queue = new LinkedList<>();
            int index =0;
            //#2: capture initial window values and populate the queue with the -ve number
            while(index < window){
                if(arr[index]<0){
                    queue.add(arr[index]);
                }
                index++;
            }
            results[0] = queue.isEmpty()?0: queue.peek();

            //Build the result with the first negative number as we progress

            //Loop through the remaining array based on the window side and perform steps after #2 above
            //Return result array
            for(int i=1;i<n-window+1;i++){
                if(arr[i-1]<0){
                    queue.poll();
                }
                if (arr[i+window-1]<0){
                    queue.add(arr[i+window-1]);
                }
                results[i] = queue.isEmpty()?0: queue.peek();
            }

            return results;
        }

        public static void main(String[] args) {
            negativeNumberSlidingWindow sol = new negativeNumberSlidingWindow();
            int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
            int window = 3;
            System.out.println(Arrays.toString(sol.negativeNumbers(arr, window))); // Expected output: 2
        }
    }

