// Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

// Note:- The position you return should be according to 1-based indexing. 

import java.util.HashMap;

class Solution23 {
    int smallestRepeatingElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i))
                map.replace(i, map.get(i) + 1);
            map.putIfAbsent(i, 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1) {
                return (i + 1);
            }

        }
        return -1;
    }

}

public class Q23 {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        Solution23 s = new Solution23();
        int ans = s.smallestRepeatingElement(arr);
        System.out.println("Smallest Repeating index: " + ans);
    }
}