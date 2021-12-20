package katas.binarytotext;

import java.util.ArrayList;

// Kata: https://www.codewars.com/kata/5583d268479559400d000064

public class Solution {

    public static String binaryToText(String binary) {

        ArrayList<String> binaryLetters = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < binary.length(); i += 8) {
            binaryLetters.add(binary.substring(i, i + 8));
        }

        for (String letter : binaryLetters) {
            Character ascii = (char) Integer.parseInt(letter, 2);
            stringBuilder.append(ascii);
        }

        return stringBuilder.toString();
    }
}
