package com.javafortesters.strings;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by david on 10/9/15.
 */
public class stringTestConcatenation {

    @Test
    public void stringConcatTest1() {

        assertThat("123456", is("12" + "34" + "56"));
    }

    @Test
    public void stringConcatTest2() {

        assertThat("123456", equalTo("12" + "34" + "56"));
    }

    @Test
    public void stringConcatTest3() {

        assertThat("123456", is(equalTo("12" + "34" + "56")));
    }

    @Test
    public void stringConcatTest4() {

        String ps1 = "This is " + "String2";

        assertThat(ps1, is("This is String2"));
    }

    @Test
    public void stringConcatTest5() {

        String ps2 = "This is " + 4;

        assertThat(ps2, is("This is 4"));
    }

    @Test
    public void stringConcatTest6() {

        String thisIs = "This is ";
        String s1 = thisIs.concat("String1");

        assertThat(s1, is("This is String1"));
    }
}
