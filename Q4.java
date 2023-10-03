import java.util.HashMap;
import java.util.Scanner;

class Q4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        String number;
        System.out.print("Enter the Roman Number: ");
        number=sc.next();
        System.out.println("Integer Value: "+sol.romanToInt(number));
    }
}

class Solution{
    public int romanToInt(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        s=s.replace("IV", "IIII");
        s=s.replace("IX", "VIIII");
        s=s.replace("XL", "XXXX");
        s=s.replace("XC", "LXXXX");
        s=s.replace("CD", "CCCC");
        s=s.replace("CM", "DCCCC");
    
        int sum=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
            {
                sum+=(map.get(ch[i]));
            }
        return sum;
    }
}
