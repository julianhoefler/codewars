package katas.breakcamelcase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Kata: https://www.codewars.com/kata/5208f99aee097e6552000148

public class Solution {

    public static String camelCase(String input) {

        StringBuilder sb = new StringBuilder(input);
        List<String> split = new ArrayList<>(Arrays.asList(input.split("")));

        for (int i = 0; i < split.size(); i++) {
            if (split.get(i).matches("([A-Z])")) {
                sb.insert(i + sb.length() - split.size(), " ");
            }
        }
        return sb.toString();
    }
}

