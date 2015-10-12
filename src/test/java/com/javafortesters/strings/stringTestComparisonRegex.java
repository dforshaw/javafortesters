package com.javafortesters.strings;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by david on 10/11/15.
 */
public class stringTestComparisonRegex {

    String mustIncludeDigit = ".*[0123456789]+.*";

    String mustIncludeUppercase = ".*[A-Z]+.*";

    @Test
    public void stringCompareRegex1() {

        assertThat("12345678".matches(mustIncludeDigit), is(true));
    }

    @Test
    public void stringCompareRegex2() {

        assertThat("invalid".matches(mustIncludeDigit), is(false));
    }

    @Test
    public void stringCompareRegex3() {

        assertThat("Valid".matches(mustIncludeUppercase), is(true));
    }

    @Test
    public void stringCompareRegex4() {

        assertThat("val1D".matches(mustIncludeUppercase), is(true));
    }
}
