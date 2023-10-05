//Valid Parenthesis
import java.util.*;

public class Q7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Solution7 sol = new Solution7();
        System.out.println("Enter the expression: ");
        String s = sc.next();
        System.out.println("Parenthesis Match: "+sol.isValid(s));
    }
}

class Solution7{
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char sym = s.charAt(i);
            if(sym=='('|| sym=='['||sym=='{')
                stack.push(sym);
            else if(sym==')' || sym==']' || sym=='}'){
                if(stack.isEmpty())
                    return false;
                else if(sym==')' && stack.peek()!='(')
                    return false;
                else if(sym==']' && stack.peek()!='[')
                    return false;
                else if(sym=='}' && stack.peek()!='{')
                    return false;
                else
                    stack.pop();
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}