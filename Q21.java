// Given an array of integers nums, calculate the pivot index of this array.

// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

// Return the leftmost pivot index. If no such index exists, return -1.

class Solution21 {
    public int pivotIndex(int[] nums) {
        int pivot;

        for (pivot = 0; pivot < nums.length; pivot++) {
            int left_sum = 0;
            int right_sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i < pivot) {
                    left_sum += nums[i];
                    // System.out.println("Left sum when pivot index: " + pivot + " is: " +
                    // left_sum);
                } else if (i > pivot) {
                    right_sum += nums[i];
                    // System.out.println("Right sum when pivot index: " + pivot + " is: " +
                    // right_sum);
                }
            }
            if (left_sum == right_sum)
                return pivot;
        }

        return -1;
    }
}

public class Q21 {
    public static void main(String[] args) {
        Solution21 s = new Solution21();

        int nums[] = { 2, 1, -1 };

        int pi = s.pivotIndex(nums);

        System.out.println("Pivot index is : " + pi);
    }

}