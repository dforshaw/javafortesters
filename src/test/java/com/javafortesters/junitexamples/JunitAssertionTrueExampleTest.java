package com.javafortesters.junitexamples;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JunitAssertionTrueExampleTest {

    Boolean falsey = false;
    Boolean truthy = true;

    @Test
    public void AssertTrueExample() {
        assertTrue("This is true", truthy);
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
