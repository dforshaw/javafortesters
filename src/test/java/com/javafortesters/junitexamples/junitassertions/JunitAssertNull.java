package com.javafortesters.junitexamples.junitassertions;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class JunitAssertNull {

    String notNull = "a";
    String isNull = null;

    @Test
    public void AssertNullTest() {
        assertNull(isNull);
    }

    @Test
    public void AssertNullWithMessageTest() {
        assertNull("This is null", isNull);
    }

    @Test  (expected = AssertionError.class)
    public void AssertNullFailureWithMessageTest() {
        assertNull("This might not be null", notNull);
    }
}
