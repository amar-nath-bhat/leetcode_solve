//Two Sum Question: 

package Q1;
import java.util.*;
class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Solution1 sol = new Solution1();

        int arr[]= new int[100];
        int i, n, target;

        System.out.println("Enter the No. Of Elements of Array:");
        n=sc.nextInt();

        System.out.println("Enter the Elements of Array:");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println("Enter the Target Element:");
        target=sc.nextInt();

        arr =sol.twoSum(arr,target);

        System.out.print("Indices of Required Elements are: ");
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
    }
}

class Solution1 {
    public int[] twoSum(int nums[], int target) {
        int res[]={0,0};
        
        int i, j;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    res[0] = i;
                    res[1] = j;
                    return res; // Return the indices of the two elements
                }
            }
        }
        res[0] = -1;
        res[1] = -1;
        return res;
    }
}