package com.javafortesters.junitexamples.junitassertions;


import org.junit.Test;

import static org.junit.Assert.*;

public class JunitAssertEquals {

    @Test
    public void AssertEqualsTest() {
        assertEquals(6, 3 + 3);
    }

    @Test
    public void AssertEqualsWithMessageTest() {
        assertEquals("3 + 3 = 6", 6, 3 + 3);
    }

    @Test  (expected = AssertionError.class)
    public void AssertEqualsFailureWithMessageTest() {
        assertEquals("3 + 3 = 6", 5, 3 + 3);
    }
}
