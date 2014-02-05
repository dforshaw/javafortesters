package com.javafortesters.junitexamples.junitassertions;


import org.junit.Test;

import static org.junit.Assert.*;

public class JunitAssertEquals {

    @Test
    public void AssertionExample() {
        assertEquals(6, 3 + 3);
    }

    @Test
    public void AssertionWithMessageTest() {
        assertEquals("3 + 3 = 6", 6, 3 + 3);
    }

    @Test  (expected = AssertionError.class)
    public void AssertionFailureWithMessageTest() {
        assertEquals("3 + 3 = 6", 5, 3 + 3);
    }
}
