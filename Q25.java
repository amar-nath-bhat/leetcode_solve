// Given an integer N, find its factorial. return a list of integers denoting the digits that make up the factorial of N.

import java.util.ArrayList;
import java.util.Collections;

class Solution25 {
    static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> aL = new ArrayList<>();
        aL.add(1);
        int carry = 0;
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < aL.size(); j++) {
                int temp = (aL.get(j) * i) + carry;
                aL.set(j, temp % 10);
                carry = temp / 10;
            }
            while (carry > 0) {
                aL.add(carry % 10);
                carry /= 10;
            }
        }
        Collections.reverse(aL);
        return aL;
    }
}

public class Q25 {
    public static void main(String[] args) {
        System.out.println(Solution25.factorial(12));
    }
}
