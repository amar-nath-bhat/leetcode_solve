import java.util.ArrayList;
import java.util.Scanner;

public class Q12 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        Solution12 sol = new Solution12();
        System.out.println("Enter the string: ");
        String s = sc.next();
        System.out.println(sol.lengthOfLongestSubstring(s));
    }
}

class Solution12 {
    public int lengthOfLongestSubstring(String s) {
        char ch[]= s.toCharArray();
        int i=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(i=0;i<s.length();i++)
        {
            int a= (int) ch[i];
            if(i==0)
                arr.add(a);
            else if(arr.contains(a))
                break;
            else
                arr.add(a);
        }
        return arr.size();
    
    }
}
