package com.javafortesters.junitexamples.junitassertions;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class JunitAssertArrayEquals {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void AssertArrayEqualsTest() {
        String[] testArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        assertArrayEquals(testArray, workdays);
    }

    @Test
    public void AssertArrayEqualsWithMessageTest() {
        String[] testArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        assertArrayEquals("Arrays match: testArray = workdays",testArray, workdays);
    }

    @Test  (expected = AssertionError.class)
    public void AssertArrayEqualsFailureWithMessageTest() {
        String[] testArray = {"Monday", "Tuesday", "Wednesday", "Thursday"};
        assertArrayEquals("Arrays do not match: testArray != workdays",testArray, workdays);
    }
}
