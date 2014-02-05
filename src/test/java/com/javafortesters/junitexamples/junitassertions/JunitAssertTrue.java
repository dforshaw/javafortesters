package com.javafortesters.junitexamples.junitassertions;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JunitAssertTrue {

    Boolean falsey = false;
    Boolean truthy = true;

    @Test
    public void AssertTrueTest() {
        assertTrue(truthy);
    }

    @Test
    public void AssertTrueWithMessageTest() {
        assertTrue("This is true", truthy);
    }

    @Test  (expected = AssertionError.class)
    public void AssertTrueFailureWithMessageTest() {
        assertTrue("This might not be true", falsey);
    }
}
