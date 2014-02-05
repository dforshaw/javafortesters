package com.javafortesters.junitexamples.junitassertions;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class JunitAssertNotNull {

    String notNull = "a";
    String isNull = null;

    @Test
    public void AssertNotNullTest() {
        assertNotNull(notNull);
    }

    @Test
    public void AssertNotNullWithMessageTest() {
        assertNotNull("This is not null", notNull);
    }

    @Test  (expected = AssertionError.class)
    public void AssertNotNullFailureWithMessageTest() {
        assertNotNull("This might be null", isNull);
    }
}
