package com.javafortesters.junitexamples;

import org.junit.Test;

import static org.junit.Assert.*;

public class JunitExerciseAllAsserts {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    String[] testArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    Boolean falsey = false;
    Boolean truthy = true;
    String phrase1 = "abc";
    String phrase2 = "abc";
    String phrase3 = "abcd";
    String notNull = "a";
    String isNull = null;

    @Test
    public void AssertTests() {

        assertArrayEquals(testArray, workdays);
        assertEquals(phrase1, phrase2);
        assertFalse(falsey);
        assertTrue(truthy);
        assertSame(phrase1, phrase2);
        assertNotSame(phrase1, phrase3);
        assertNull(isNull);
        assertNotNull(notNull);
    }
}
