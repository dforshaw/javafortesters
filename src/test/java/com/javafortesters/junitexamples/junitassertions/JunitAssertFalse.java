package com.javafortesters.junitexamples.junitassertions;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class JunitAssertFalse {

    Boolean falsey = false;
    Boolean truthy = true;

    @Test
    public void AssertFalseExample() {
        assertFalse(falsey);
    }

    @Test
    public void AssertFalseWithMessageTest() {
        assertFalse("This is false", falsey);
    }

    @Test  (expected = AssertionError.class)
    public void AssertFalseFailureWithMessageTest() {
        assertFalse("This might not be false", truthy);
    }
}
