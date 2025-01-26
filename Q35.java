// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

class Solution35 {
    public boolean isPalindrome(String s) {
        char string[] = s.toLowerCase().toCharArray();
        System.out.println(string);
        String dup = "";
        for (char i : string) {
            if ((i >= 97 && i <= 122) || (i >= 48 && i <= 57)) {
                System.out.println(i);
                dup += i;
            }
        }
        StringBuffer s1 = new StringBuffer(dup);
        if (dup.contentEquals(s1.reverse().toString())) {
            System.out.println(dup);
            return true;
        } else {
            return false;
        }
    }
}

public class Q35 {
    public static void main(String[] args) {
        Solution35 s = new Solution35();
        System.out.println(s.isPalindrome("0P"));
    }
}
