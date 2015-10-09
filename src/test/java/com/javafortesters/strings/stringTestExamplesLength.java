package com.javafortesters.strings;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by david on 10/9/15.
 */
public class stringTestExamplesLength {

    @Test
    public void stringLengthTest1() {

        String aString = "abcdef";

        assertThat(aString.length(), is(6));
    }

    @Test
    public void stringLengthTest2() {

        assertThat("hello".length(), is(5));
    }
}
