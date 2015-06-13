package com.prunatic.codewars.kyu7.jadenCasingStrings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        String[] parts = phrase.split("\\s");
        String result = Arrays
            .stream(parts)
            .map(word -> String.format("%s%s", word.substring(0, 1).toUpperCase(), word.substring(1)))
            .collect(Collectors.joining(" "))
        ;

        return result;
    }
}
