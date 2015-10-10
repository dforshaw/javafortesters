package com.javafortesters.strings;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by david on 10/9/15.
 */
public class stringTestComparisons {

    @Test
    public void stringComparisonTestCompareTo() {

        String hello = "Hello";

        assertThat(hello.compareTo("Hello"), is(0));
    }

    @Test
    public void stringComparisonTestCompareToNeg1() {

        String hello = "Hello";

        assertThat(hello.compareTo("hello") < 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToNeg2() {

        String hello = "Hello";

        assertThat(hello.compareTo("Helloo") < 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToNeg3() {

        String hello = "Hello";

        assertThat(hello.compareTo("Hemlo") < 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToPos1() {

        String hello = "Hello";

        assertThat(hello.compareTo("H") > 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToPos2() {

        String hello = "Hello";

        assertThat(hello.compareTo("Helln") > 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToPos3() {

        String hello = "Hello";

        assertThat(hello.compareTo("HeLlo") > 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToIgnoreCase1() {

        String hello = "Hello";

        assertThat(hello.compareToIgnoreCase("hello"), is(0));
    }

    @Test
    public void stringComparisonTestCompareToIgnoreCase2() {

        String hello = "Hello";

        assertThat(hello.compareToIgnoreCase("Hello"), is(0));
    }

    @Test
    public void stringComparisonTestCompareToIgnoreCase3() {

        String hello = "Hello";

        assertThat(hello.compareToIgnoreCase("HeLlo"), is(0));
    }
}
