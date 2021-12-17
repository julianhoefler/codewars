package katas.keypad;

import java.util.Arrays;

// Kata: https://www.codewars.com/kata/54a2e93b22d236498400134b

public class Solution {

    public static int presses(String phrase) {
        String[] checker = {".?!()/&%$§\\\"\\\\-_,><|;:@'",
                "1AaDdGgJjMmPpTtWw*# ",
                "BbEeHhKkNnQqUuXx0",
                "CcFfIiLlOoRrVvYy",
                "23456Ss8Zz",
                "79"};
        int presses = 0;

        for (String character : phrase.split("")) {
            presses += Arrays
                    .asList(checker)
                    .indexOf(Arrays.stream(checker)
                            .filter(v -> v.contains(character))
                            .findFirst()
                            .orElseGet(() -> ".")
                    );
        }
        return presses == 0 ? 1 : presses;
    }
}
