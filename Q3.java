//Number of Good Pairs: q1512

import java.util.Scanner;

public class Q3
{
    public static void main(String args[])
    {
        Solution3 n = new Solution3();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No. Of Elements of Array:");
        int len=sc.nextInt();

        int arr[]= new int[len];

        System.out.println("Enter the Elements of Array:");
        for(int i=0;i<len;i++)
            arr[i]=sc.nextInt();

        System.out.println(n.numIdenticalPairs(arr));
    }
}

class Solution3 {
    public int numIdenticalPairs(int[] nums) {
        int counter=0, i, j;

        for(i=0;i<nums.length;i++)
            for(j=i+1;j<nums.length;j++)
                if(nums[i]==nums[j])
                    counter++;

        return counter;
    }
}