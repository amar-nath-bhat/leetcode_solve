// Given an array arr[] of size N having integers in the range [1, N] with some of the elements missing. The task is to find the missing elements.

// Note: There can be duplicates in the array.

class Solution22 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 3, 3, 5 };
        int n = arr.length;
        int missing[] = new int[n - 1];
        for (int i : arr) {
            // System.out.println("i: " + i + " arr[i-1]: " + arr[i - 1]);
            if (i > 0) {
                arr[i - 1] = (i) * -1;
            }
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing[j] = i;
                j++;
            }
        }
        for (int num : missing) {
            System.out.println((num + 1) + " ");
        }
    }
}