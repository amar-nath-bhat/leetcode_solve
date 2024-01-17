// Dilpreet wants to paint his dog's home that has n boards with different lengths. The length of ith board is given by arr[i] where arr[] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board. 

// The problem is to find the minimum time to get this job done if all painters start together with the constraint that any painter will only paint continuous boards, say boards numbered {2,3,4} or only board {1} or nothing but not boards {2,4,5}.

class Solution30 {

    static int findSum(int arr[], int n) {
        int total = 0;
        for (int i = 0; i < n; i++)
            total += arr[i];
        return total;
    }

    static int numOfPainters(int arr[], int n, int max) {
        int total = 0;
        int num = 1;
        for (int i = 0; i < n; i++) {
            total += arr[i];
            if (total > max) {
                total = arr[i];
                num++;
            }

        }
        return num;
    }

    static int findMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static long minTime(int[] arr, int n, int k) {

        int low = findMax(arr, n);
        int high = findSum(arr, n);
        while (low < high) {
            int mid = low + (high - low) / 2;
            int num = numOfPainters(arr, n, mid);
            if (num <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

public class Q30 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Solution30.minTime(arr, arr.length, 3));
    }
}
