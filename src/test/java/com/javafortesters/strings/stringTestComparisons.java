package com.javafortesters.strings;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by david on 10/9/15.
 */
public class stringTestComparisons {

    String hello = "Hello";
    String helloFella = "Hello fella";

    @Test
    public void stringComparisonTestCompareTo() {

        assertThat(hello.compareTo("Hello"), is(0));
    }

    @Test
    public void stringComparisonTestCompareToNeg1() {

        assertThat(hello.compareTo("hello") < 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToNeg2() {

        assertThat(hello.compareTo("Helloo") < 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToNeg3() {

        assertThat(hello.compareTo("Hemlo") < 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToPos1() {

        assertThat(hello.compareTo("H") > 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToPos2() {

        assertThat(hello.compareTo("Helln") > 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToPos3() {

        assertThat(hello.compareTo("HeLlo") > 0, is(true));
    }

    @Test
    public void stringComparisonTestCompareToIgnoreCase1() {

        assertThat(hello.compareToIgnoreCase("hello"), is(0));
    }

    @Test
    public void stringComparisonTestCompareToIgnoreCase2() {

        assertThat(hello.compareToIgnoreCase("Hello"), is(0));
    }

    @Test
    public void stringComparisonTestCompareToIgnoreCase3() {

        assertThat(hello.compareToIgnoreCase("HeLlo"), is(0));
    }

    @Test
    public void stringComparisonTestContains1() {

        assertThat(hello.contains("He"), is(true));
    }

    @Test
    public void stringComparisonTestContains2() {

        assertThat(hello.contains("Hello"), is(true));
    }

    @Test
    public void stringComparisonTestContains3() {

        assertThat(hello.contains("LL"), is(false));
    }

    @Test
    public void stringComparisonTestContains4() {

        assertThat(hello.contains("z"), is(false));
    }

    @Test
    public void stringComparisonTestContentEquals1() {

        assertThat(hello.contentEquals("Hello"), is(true));
    }

    @Test
    public void stringComparisonTestContentEquals2() {

        assertThat(hello.contentEquals("hello"), is(false));
    }

    @Test
    public void stringComparisonTestEqualsIgnoreCase() {

        assertThat(hello.equalsIgnoreCase("hello"), is(true));
    }

    @Test
    public void stringComparisonTestEndsWith1() {

        assertThat(hello.endsWith("Hello"), is(true));
    }

    @Test
    public void stringComparisonTestEndsWith2() {

        assertThat(hello.endsWith(""), is(true));
    }

    @Test
    public void stringComparisonTestEndsWith3() {

        assertThat(hello.endsWith("lo"), is(true));
    }

    @Test
    public void stringComparisonTestEndsWith4() {

        assertThat(hello.endsWith("Lo"), is(false));
    }

    @Test
    public void stringComparisonTestStartsWith1() {

        assertThat(hello.startsWith("Hello"), is(true));
    }

    @Test
    public void stringComparisonTestStartsWith2() {

        assertThat(hello.startsWith(""), is(true));
    }

    @Test
    public void stringComparisonTestStartsWith3() {

        assertThat(hello.startsWith("He"), is(true));
    }

    @Test
    public void stringComparisonTestStartsWith4() {

        assertThat(hello.startsWith("he"), is(false));
    }

    @Test
    public void stringComparisonTestEmpty1() {

        String empty = "";

        assertThat(empty.isEmpty(), is(true));
    }

    @Test
    public void stringComparisonTestEmpty2() {

        String empty = "";

        assertThat(empty.length(), is(0));
    }

    @Test
    public void stringComparisonRegionMatches1() {

        assertThat(helloFella.regionMatches(true, 6, "fez", 0, 2), is(true));
    }

    @Test
    public void stringComparisonRegionMatchesEx1() {

        //Exercise

        String helloFella = "Hello fella";

        assertThat(helloFella.regionMatches(true, 9, "young lady", 6, 2), is(true));
    }

    @Test
    public void stringComparisonIndexes1() {

        assertThat(helloFella.indexOf("l"), is(2));
    }

    @Test
    public void stringComparisonIndexes2() {

        assertThat(helloFella.lastIndexOf("l"), is(9));
    }

    @Test
    public void stringComparisonIndexes3() {

        assertThat(helloFella.indexOf("l", 3), is(3));
    }

    @Test
    public void stringComparisonIndexes4() {

        assertThat(helloFella.indexOf("l", 4), is(8));
    }

    @Test
    public void stringComparisonIndexes5() {

        assertThat(helloFella.lastIndexOf("l", 8), is(8));
    }

    @Test
    public void stringComparisonIndexes6() {

        assertThat(helloFella.lastIndexOf("l", 7), is(3));
    }

    @Test
    public void stringComparisonIndexes7() {

        assertThat(helloFella.indexOf("z"), is(-1));
    }

    @Test
    public void stringComparisonIndexes8() {

        assertThat(helloFella.lastIndexOf("z"), is(-1));
    }
}
