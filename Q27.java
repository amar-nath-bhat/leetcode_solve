// Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

// A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

// 0 <= i, j < nums.length
// i != j
// |nums[i] - nums[j]| == k
// Notice that |val| denotes the absolute value of val.

import java.util.HashMap;

class Solution27 {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // System.out.println("I: " + nums[i] + " J: " + nums[j]);
                // System.out.println("nums[i]-nums[j]= " + (nums[i] - nums[j]));
                if ((nums[i] - nums[j]) == k || nums[i] - nums[j] == k * -1) {
                    map.put(nums[i], nums[j]);
                    // count++;
                }
            }
        }
        // System.out.println(map);
        return map.size();
    }
}

public class Q27 {
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        int a[] = { -1, -2, -3 };
        System.out.println(s.findPairs(a, 1));
    }
}
