// You have N books, each with A[i] number of pages. M students need to be allocated contiguous books, with each student getting at least one book.
// Out of all the permutations, the goal is to find the permutation where the sum of maximum number of pages in a book allotted to a student should be minimum, out of all possible permutations.

// Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).
class Solution29 {
    // Function to find minimum number of pages.
    public static int findPages(int[] A, int N, int M) {
        if (N < M)
            return -1;

        int sum = 0;
        for (int x : A) {
            sum += x;
        }
        int start = 0, end = sum, ans = 1000000000;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (isPossible(A, N, M, mid)) {
                ans = ans < mid ? ans : mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] A, int N, int M, int currMin) {
        int studReq = 1, currSum = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > currMin) {
                return false;
            }

            if (currSum + A[i] > currMin) {
                studReq++;
                currSum = A[i];
                if (studReq > M) {
                    return false;
                }
            } else {
                currSum += A[i];
            }

        }
        return true;
    }

};

public class Q29 {
    public static void main(String[] args) {
        int arr[] = { 15, 10, 19, 10, 5, 18, 7 };
        System.out.println(Solution29.findPages(arr, 7, 5));
    }
}
