// Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

// An integer a is closer to x than an integer b if:

// |a - x| < |b - x|, or
// |a - x| == |b - x| and a < b

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pair {
    int val;
    int dist;

    Pair(int val, int dist) {
        this.val = val;
        this.dist = dist;
    }
}

class Solution28 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Pair> objList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Pair obj = new Pair(arr[i], Math.abs(arr[i] - x));
            objList.add(obj);
        }

        Collections.sort(objList, new Comparator<Pair>() {
            public int compare(Pair obj1, Pair obj2) {
                if (obj1.dist != obj2.dist) {
                    return (Integer.valueOf(obj1.dist).compareTo(Integer.valueOf(obj2.dist)));
                } else {
                    return (Integer.valueOf(obj1.val).compareTo(Integer.valueOf(obj2.val)));
                }
            }
        });

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(objList.get(i).val);
        }
        Collections.sort(result);
        return result;
    }
}

public class Q28 {
    public static void main(String[] args) {
        Solution28 s = new Solution28();
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(s.findClosestElements(arr, 4, 3));
        ;
    }
}
