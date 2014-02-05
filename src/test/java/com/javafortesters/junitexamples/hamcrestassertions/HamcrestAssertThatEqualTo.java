package com.javafortesters.junitexamples.hamcrestassertions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestAssertThatEqualTo {

    @Test
    public void AssertThatIsTest() {
        assertThat(3 + 3, equalTo(6));
    }

    @Test
    public void AssertThatIsWithMessageTest() {
        assertThat("3 + 3 = 6",  3 + 3, equalTo(6));
    }

    @Test  (expected = AssertionError.class)
    public void AssertThatIsFailureTest() {
        assertThat(3 + 3, equalTo(7));
    }
}
