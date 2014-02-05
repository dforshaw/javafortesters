package com.javafortesters.junitexamples.junitassertions;

import org.junit.Test;

import static org.junit.Assert.assertNotSame;

public class JunitAssertNotSame {

    String phrase1 = "abc";
    String phrase2 = "abcd";
    Integer num1 = 111;
    Integer num2 = 112;

    @Test
    public void AssertNotSameStringTest() {
        assertNotSame(phrase1, phrase2);
    }

    @Test
    public void AssertNotSameStringWithMessageTest() {
        assertNotSame("This is not same", phrase1, phrase2);
    }

    @Test  (expected = AssertionError.class)
    public void AssertNotSameStringFailureWithMessageTest() {
        assertNotSame("This might be the same", phrase1, phrase1);
    }

    @Test
    public void AssertNotSameIntegerTest() {
        assertNotSame(num1, num2);
    }

    @Test
    public void AssertNotSameIntegerWithMessageTest() {
        assertNotSame("This is not same", num1, num2);
    }

    @Test  (expected = AssertionError.class)
    public void AssertNotSameIntegerFailureWithMessageTest() {
        assertNotSame(num1, num1);
    }
}
