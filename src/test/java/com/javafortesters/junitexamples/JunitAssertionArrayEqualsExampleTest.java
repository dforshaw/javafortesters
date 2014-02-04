package com.javafortesters.junitexamples;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class JunitAssertionArrayEqualsExampleTest {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void AssertArrayEqualsExample() {
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
