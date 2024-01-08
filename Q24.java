// Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
// Note: can you take care of the duplicates without using any additional Data Structure?

import java.util.ArrayList;

class Solution24 {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> aL = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                if (!aL.contains(A[i])) {
                    aL.add(A[i]);
                }
                i++;
                j++;
                k++;
            } else if (A[i] < B[j])
                i++;
            else if (B[j] < C[k])
                j++;
            else
                k++;
        }
        return aL;
    }
}

public class Q24 {
    public static void main(String[] args) {
        int A[] = { 3, 3, 3 };
        int B[] = { 3, 3, 3 };
        int C[] = { 3, 3, 3 };

        Solution24 s = new Solution24();
        ArrayList<Integer> aL = s.commonElements(A, B, C, A.length, B.length, C.length);
        System.out.println(aL);
    }
}
