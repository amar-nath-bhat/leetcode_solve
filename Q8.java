import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Q8 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Solution8 sol = new Solution8();

        System.out.println("Enter the no. of elements elements: ");
        int n = sc.nextInt();
        int nums[]=new int[n];

        System.out.println("Enter the no. of elements elements: ");
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();

        System.out.println(sol.majorityElement(nums));
    }
}    
    
class Solution8 {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList <Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        
        int mark=n/3, count;
        for ( Integer key : map.keySet()) {
            count = map.get(key);
            if(count > mark)
                list.add(key);
        }
        return list;
    }
}
