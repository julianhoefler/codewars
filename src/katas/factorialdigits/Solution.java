package katas.factorialdigits;

// Kata: https://www.codewars.com/kata/58fea5baf3dff03a6e000102

public class Solution {

    public static int factDigits(int n) {
        if (n <= 1) {
            return 1;
        }
        double digits = 0;
        for (int i = 2; i <= n; i++)
            digits += Math.log10(i);

        return (int) (Math.floor(digits)) + 1;
    }
}
