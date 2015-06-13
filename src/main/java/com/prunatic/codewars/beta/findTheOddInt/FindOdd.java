package com.prunatic.codewars.beta.findTheOddInt;

import java.util.HashSet;
import java.util.Set;

public class FindOdd {
    public static int findIt(int[] A) {
        Set<Integer> occurrences = new HashSet<>();

        for (int elem: A) {
            if (occurrences.contains(elem)) {
                occurrences.remove(elem);
            } else {
                occurrences.add(elem);
            }
        }
        Integer result = (Integer) occurrences.toArray()[0];

        return result;
    }
}
