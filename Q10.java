//343. Integer Break

import java.util.*;
import java.lang.Math;

class Q10{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Solution10 sol = new Solution10();

        System.out.println("Enter the number: ");
        int n= sc.nextInt();

        System.out.println("The Integer Break Product is: "+sol.integerBreak(n));

    }
}

class Solution10 {
    public int integerBreak(int n) {
        if(n==2)
            return 1;
        if(n==3)
            return 2;

        //base cases above
        //pattern generated below

        else if(n%3==0)
            return (int) (Math.pow(3, n/3)); 
        else if(n%3==1)
            return(int) (Math.pow(3,(n/3)-1)*4);
        else if(n%3==2)
            return(int) (Math.pow(3,(n/3))*2);
        else 
            return 0;
    }

}