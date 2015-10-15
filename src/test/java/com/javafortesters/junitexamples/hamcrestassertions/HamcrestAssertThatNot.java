package com.javafortesters.junitexamples.hamcrestassertions;

import org.junit.Test;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestAssertThatNot {

    @Test
    public void AssertThatNotTest() {
        assertThat(3 + 3, not(7));
    }

    @Test
    public void AssertThatNotWithMessageTest() {
        assertThat("3 + 3 = 6",  3 + 3, not(7));
    }

    @Test  (expected = AssertionError.class)
    public void AssertThatNotFailureTest() {
        assertThat(3 + 3, not(6));
    }
}
