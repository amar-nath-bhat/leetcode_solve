class Solution34 {
    public static void reverse(int[] nums, int start, int end, int k) {
        System.out.println("K: " + k);
        for (int i = 0; i < k / 2; i++) {
            System.out.println("Num1: " + nums[start] + " Num2: " + nums[end - 1]);
            int temp = nums[start];
            nums[start] = nums[end - 1];
            nums[end - 1] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        Solution34.reverse(nums, nums.length - k, nums.length, k);
        Solution34.reverse(nums, 0, nums.length - k, nums.length - k);
        Solution34.reverse(nums, 0, nums.length, nums.length);
    }
}

public class Q34 {
    public static void main(String[] args) {
        Solution34 s = new Solution34();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // s.rotate(arr, 3);
        Solution34.reverse(arr, 0, 7, 7);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
