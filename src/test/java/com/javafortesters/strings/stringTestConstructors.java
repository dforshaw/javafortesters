package com.javafortesters.strings;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by david on 10/9/15.
 */
public class stringTestConstructors {

    @Test
    public void stringConstructorTestEmpty() {

        String empty = new String();

        assertThat(empty.length(), is(0));
    }

    @Test
    public void stringConstructorTestChar() {

        char[] cArray = {'2', '3'};

        assertThat(new String(cArray), is("23"));
    }
}
