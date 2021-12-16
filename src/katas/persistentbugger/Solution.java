package katas.persistentbugger;

import java.util.Arrays;

// Kata: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

class Solution {
    public static int persistence(long n) {
        int counter = 0;
        int[] array = Arrays
                .stream(Long.toString(n).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (array.length != 1) {
            array = Arrays
                    .stream(multiply(array).toString().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            counter++;
        }
        return counter;
    }

    private static Integer multiply(int[] array) {
        int result = 1;
        for (int num : array) {
            result *= num;
        }
        return array.length == 0 ? 0 : result;
    }
}
