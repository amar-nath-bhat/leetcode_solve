class Solution32 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                k--;
                j--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}

public class Q32 {
    public static void main(String[] args) {
        Solution32 s = new Solution32();
        int arr1[] = { 0, 0, 3, 0, 0, 0, 0, 0, 0 };
        int arr2[] = { -1, 1, 1, 1, 2, 3 };
        s.merge(arr1, 3, arr2, 6);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
