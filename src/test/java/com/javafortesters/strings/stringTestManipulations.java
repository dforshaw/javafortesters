package com.javafortesters.strings;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by david on 10/11/15.
 */
public class stringTestManipulations {

    String helloFella = "Hello fella fella fella";
    String digitList = "1,2,3";
    String lowerThirdText = "In the lower 3rd";
    String digits = "0123456789";

    @Test
    public void stringTestManipulationsReplace() {

        assertThat(helloFella.replace("fella", "World"), is("Hello World World World"));
    }

    @Test
    public void stringTestManipulationsReplaceFirst1() {

        assertThat(helloFella.replaceFirst("fella", "World"), is("Hello World fella fella"));
    }

    @Test
    public void stringTestManipulationsReplaceFirst2() {

        assertThat(digitList.replaceFirst("[0-9]", "digit"), is("digit,2,3"));
    }

    @Test
    public void stringTestManipulationsReplaceAll() {

        assertThat(digitList.replaceAll("[0-9]", "digit"), is("digit,digit,digit"));
    }

    @Test
    public void stringTestManipulationsToUpperCase() {

        assertThat(lowerThirdText.toUpperCase(), is("IN THE LOWER 3RD"));
    }

    @Test
    public void stringTestManipulationsToLowerCase() {

        assertThat(lowerThirdText.toLowerCase(), is("in the lower 3rd"));
    }

    @Test
    public void stringTestManipulationsTrim() {

        String padded = "    trim me    ";

        assertThat(padded.length(), is(15));

        String trimmed = padded.trim();

        assertThat(trimmed.length(), is(7));

        assertThat(trimmed, is("trim me"));
    }

    @Test
    public void stringTestManipulationsSubstring1() {

        assertThat(digits.substring(5), is("56789"));
    }

    @Test
    public void stringTestManipulationsSubstring2() {

        assertThat(digits.substring(5,6), is("5"));
    }

    @Test
    public void stringTestManipulationsFormat1() {

        int value = 4;

        String output = "The value " + value + " was used";

        assertThat(output, is("The value 4 was used"));


        String template = "The value %d was used";

        String formatted = String.format(template, value);

        assertThat(formatted, is("The value 4 was used"));
    }

    @Test
    public void stringTestManipulationsFormat2() {

        String use = "%s %s towards %d large %s";

        assertThat(String.format(use, "Bob", "ran", 6, "onions"), is("Bob ran towards 6 large onions"));
    }

    @Test
    public void stringTestManipulationsFormat3() {

        String txt = "%2$s %4$s towards %3$d large %1$s";

        assertThat(String.format(txt, "Bob", "ran", 6, "onions"), is("ran onions towards 6 large Bob"));
    }

    @Test
    public void stringTestManipulationsFormat4() {

        String txt2 = "%1$s %1$s towards %3$d large %1$s";

        assertThat(String.format(txt2, "Bob", "ran", 6, "onions"), is("Bob Bob towards 6 large Bob"));
    }

    @Test
    public void stringTestManipulationsSplit() {

        String csv = "1,2,3,4,5,6,7,8,9,10";
        String[] results = csv.split(",");

        assertThat(results.length, is(10));

        assertThat(results[0], is("1"));
        assertThat(results[9], is("10"));
    }
}
