package com.javafortesters.junitexamples.hamcrestassertions;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class JunitHamcrestAssertThatIs {

    @Test
    public void AssertThatIsTest() {
        assertThat(3 + 3, is(6));
    }

    @Test
    public void AssertThatIsWithMessageTest() {
        assertThat("3 + 3 = 6",3 + 3, is(6));
    }

    @Test  (expected = AssertionError.class)
    public void AssertThatIsFailureTest() {
        assertThat(3 + 3, is(7));
    }
}
