package com.javafortesters.junitexamples.junitassertions;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class JunitAssertSame {

    String phrase1 = "abc";
    String phrase2 = "abc";
    String phrase3 = "abcd";
    Integer num1 = 111;
    Integer num2 = 111;
    Integer num3 = 112;

    @Test
    public void AssertSameStringTest() {
        assertSame(phrase1, phrase2);
    }

    @Test
    public void AssertSameStringWithMessageTest() {
        assertSame("This is the same", phrase1, phrase2);
    }

    @Test  (expected = AssertionError.class)
    public void AssertSameStringFailureWithMessageTest() {
        assertSame("This might not be the same", phrase1, phrase3);
    }

    @Test
    public void AssertSameIntegerTest() {
        assertSame(num1, num2);
    }

    @Test
    public void AssertSameIntegerWithMessageTest() {
        assertSame("This is the same", num1, num2);
    }

    @Test  (expected = AssertionError.class)
    public void AssertSameIntegerFailureWithMessageTest() {
        assertSame(num1, num3);
    }
}
