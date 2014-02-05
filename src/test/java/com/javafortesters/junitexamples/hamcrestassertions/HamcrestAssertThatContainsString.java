package com.javafortesters.junitexamples.hamcrestassertions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestAssertThatContainsString {

    String letters = "abcdef";

    @Test
    public void AssertThatContainsStringTest() {
        assertThat(letters, containsString("cd"));
    }

    @Test
    public void AssertThatContainsStringWithMessageTest() {
        assertThat("cd in the string abcdef", letters, containsString("cd"));
    }

    @Test  (expected = AssertionError.class)
    public void AssertThatContainsStringFailureTest() {
        assertThat(letters, containsString("gh"));
    }
}
