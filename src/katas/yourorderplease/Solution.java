package katas.yourorderplease;

import java.util.*;

// Kata: https://www.codewars.com/kata/55c45be3b2079eccff00010f

public class Solution {

    public static String order(String words) {
        Map<Integer, String> stringIntegerMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words.split(" ")){
            for (int i = 1; i <= 10; i++) {
                if (word.contains(String.valueOf(i))){
                    stringIntegerMap.put(i, word);
                }
            }
        }

        for (int i = 1; i <= stringIntegerMap.size(); i++) {
            stringBuilder.append(stringIntegerMap.get(i));
            if (i != stringIntegerMap.size()){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}