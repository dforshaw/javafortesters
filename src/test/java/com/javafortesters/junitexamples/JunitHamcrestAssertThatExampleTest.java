package com.javafortesters.junitexamples;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class JunitHamcrestAssertThatExampleTest {

    @Test
    public void AssertThatTest() {
        assertThat(3 + 3, is(6));
    }

    @Test
    public void AssertThatWithMessageTest() {
        assertThat("3 + 3 = 6",3 + 3, is(6));
    }

    @Test  (expected = AssertionError.class)
    public void AssertThatFailureTest() {
        assertThat(3 + 3, is(7));
    }
}
