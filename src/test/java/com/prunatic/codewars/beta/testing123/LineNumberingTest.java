package com.prunatic.codewars.beta.testing123;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class LineNumberingTest {
    @Test
    public void shouldNumberCorrectly() {
        assertEquals(LineNumbering.number(Collections.emptyList()), Collections.emptyList());
        assertEquals(LineNumbering.number(Arrays.asList("a", "b", "c")), Arrays.asList("1: a", "2: b", "3: c"));
    }
}
