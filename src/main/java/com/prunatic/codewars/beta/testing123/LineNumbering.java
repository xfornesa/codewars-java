package com.prunatic.codewars.beta.testing123;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class LineNumbering {
    static List<String> number(List<String> lines) {
        return withStream(lines);
    }

    private static List<String> withStream(List<String> lines) {
        final int[] i = {1};
        List<String> result = lines
                .stream()
                .map(line ->  String.format("%d: %s", i[0]++, line))
                .collect(Collectors.toList())
                ;
        return result;
    }

    private static List<String> withListIteration(List<String> lines) {
        List<String> result = new ArrayList<>();
        int lineNumber = 1;
        for (String line: lines) {
            String numberedLine = String.format("%d: %s", lineNumber, line);
            result.add(numberedLine);
            lineNumber++;
        }

        return result;
    }
}
