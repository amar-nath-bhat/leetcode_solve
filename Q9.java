//Reverse words in a string

import java.util.Scanner;

class Q9 {
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        Solution9 sol = new Solution9();
        System.out.println("Enter the strings: ");
        String s = sc.nextLine();
        System.out.println(sol.reverseWords(s));
    }
}

class Solution9{
    public String reverseWords(String s) {
        StringBuffer st2 = new StringBuffer();
        String [] st = s.split(" +");
        for(int i=0;i<st.length;i++)
        {
            StringBuffer word = new StringBuffer(st[i]);
            word.reverse();
            st2.append(word);
            if(i<st.length -1)
                st2.append(" ");
        }
        return st2.toString();
    }
}