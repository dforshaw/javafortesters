package com.javafortesters.junitexamples.hamcrestassertions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestAssertThatEndsWith {

    String letters = "abcdef";

    @Test
    public void AssertThatEndsWithTest() {
        assertThat(letters, endsWith("ef"));
    }

    @Test
    public void AssertThatEndsWithWithMessageTest() {
        assertThat("string abcdef ends with ef", letters, endsWith("ef"));
    }

    @Test  (expected = AssertionError.class)
    public void AssertThatEndsWithFailureTest() {
        assertThat(letters, endsWith("gh"));
    }
}
