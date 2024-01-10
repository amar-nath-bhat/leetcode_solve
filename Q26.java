// Given an array Arr of size N and a positive integer K, find the sub-array of length K with the maximum average.

class Solution26 {
    int findMaxAverage(int[] arr, int n, int k) {
        int index = 0;
        int maxSum = 0;
        int maxAvg = 0;

        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        maxAvg = maxSum / k;

        for (int i = 1; i <= n - k; i++) {
            int currSum = maxSum - arr[i - 1] + arr[i + k - 1];
            maxSum = currSum;
            int currAvg = currSum / k;

            if (currAvg > maxAvg) {
                maxAvg = currAvg;
                index = i;
            }
            // System.out.println("MaxAvg: " + maxAvg + " CurrAvg: " + currAvg + " Index: "
            // + index);
        }

        return index;
    }
}

public class Q26 {
    public static void main(String[] args) {
        Solution26 s = new Solution26();
        int arr[] = { -469, -8, -358, -278, -214, -436, 400, -313 };
        System.out.println(s.findMaxAverage(arr, arr.length, 7));
    }
}
