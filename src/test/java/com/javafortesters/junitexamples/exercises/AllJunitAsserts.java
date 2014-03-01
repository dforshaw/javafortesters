package com.javafortesters.junitexamples.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllJunitAsserts {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    String[] testArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    Boolean falsey = false;
    Boolean truthy = true;
    String phrase1 = "abc";
    String phrase2 = "abc";
    String phrase3 = "abcd";
    String notNull = "a";
    String isNull = null;

    @Test
    public void AssertTests_assertArrayEquals() {

        assertArrayEquals(testArray, workdays);
    }

    @Test
    public void AssertTests_assertEquals() {

        assertEquals(phrase1, phrase2);
    }

    @Test
    public void AssertTests_assertFalse() {

        assertFalse(falsey);
    }

    @Test
    public void AssertTests_assertTrue() {

        assertTrue(truthy);
    }

    @Test
    public void AssertTests_assertSame() {

        assertSame(phrase1, phrase2);
    }

    @Test
    public void AssertTests_assertNotSame() {

        assertNotSame(phrase1, phrase3);
    }

    @Test
    public void AssertTests_assertNull() {

        assertNull(isNull);
    }

    @Test
    public void AssertTests_assertNotNull() {

        assertNotNull(notNull);
    }
}
