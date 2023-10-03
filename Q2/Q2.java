package Q2;
import java.util.*;

class Q2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();

        Solution2 sol = new Solution2();
        System.out.println("Is the Number a Palindrome: "+sol.isPalindrome(n));
    }
}

class Solution2{
    public boolean isPalindrome(int x) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        s1.append(x);
        s2.append(x);
        s1.reverse();
        
        return (s1.toString().equals(s2.toString()));
    }
}