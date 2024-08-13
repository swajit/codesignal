import java.util.Arrays;

public class Leet1477NonOverlappingSubarray {
        public int minSumOfLengths(int[] arr, int target) {
            int n = arr.length;
            int[] minLen = new int[n];
            Arrays.fill(minLen, Integer.MAX_VALUE);


            int left = 0, right = 0, sum = 0;
            int minLength = Integer.MAX_VALUE;
            int result = Integer.MAX_VALUE;

            // First pass: find all subarrays that sum to the target and store their lengths in minLen
            while (right < n) {
                sum += arr[right];
                System.out.println("sum = " + sum);

               while (sum > target) {
                    sum -= arr[left];
                    left++;
               }

                if (sum == target) {
                    int currentLength = right - left + 1;
                    minLen[right] = currentLength;
                    if (left > 0 && minLen[left - 1] != Integer.MAX_VALUE) {
                        result = Math.min(result, currentLength + minLen[left - 1]);
                    }
                    minLength = Math.min(minLength, currentLength);
                }

                // Store the minimum length of subarrays ending at or before each index
                if (right > 0) {
                    minLen[right] = Math.min(minLen[right], minLen[right - 1]);
                }

                right++;
            }

            return result == Integer.MAX_VALUE ? -1 : result;
        }

        public static void main(String[] args) {
            Leet1477NonOverlappingSubarray sol = new Leet1477NonOverlappingSubarray();
            int[] arr = {3, 2, 1, 2, 3};
            int target = 3;
            System.out.println(sol.minSumOfLengths(arr, target)); // Expected output: 2
        }
    }

