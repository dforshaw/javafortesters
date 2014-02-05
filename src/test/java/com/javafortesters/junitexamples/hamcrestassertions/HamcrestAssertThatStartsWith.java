package com.javafortesters.junitexamples.hamcrestassertions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestAssertThatStartsWith {

    String letters = "abcdef";

    @Test
    public void AssertThatStartsWithTest() {
        assertThat(letters, startsWith("ab"));
    }

    @Test
    public void AssertThatStartsWithWithMessageTest() {
        assertThat("string abcdef starts with ab", letters, startsWith("ab"));
    }

    @Test  (expected = AssertionError.class)
    public void AssertThatStartsWithFailureTest() {
        assertThat(letters, startsWith("gh"));
    }
}
