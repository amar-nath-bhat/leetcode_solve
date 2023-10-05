import java.util.Arrays;
import java.util.Scanner;

class Q6{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Solution6 sol = new Solution6();
    
        System.out.println("Enter the no. of Strings:");
        int n = sc.nextInt();

        String [] s = new String[n];
        
        System.out.println("Enter the Strings:");
        for(int i=0;i<n;i++)
            s[i]=sc.next();

        String a= sol.longestCommonPrefix(s);
        System.out.println(a);

    }
}

class Solution6 {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String s1 = strs[0];
       String s2 = strs[strs.length-1];
       int i=0;
       while(i<s1.length() && i<s2.length())
       {
        if(s1.charAt(i)==s2.charAt(i))
            i++;
        else
            break;
       }

       return s1.substring(0, i);
    }
}