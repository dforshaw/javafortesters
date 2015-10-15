package com.javafortesters.strings;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by david on 10/9/15.
 */
public class stringTestToString {

    @Test
    public void stringConvertTest1() {

        String intConcatConvert = "" + 1;

        assertThat(intConcatConvert, is("1"));
    }

    @Test
    public void stringConvertTest2() {

        String intIntConvert = Integer.toString(2);

        assertThat(intIntConvert, is("2"));
    }
}
