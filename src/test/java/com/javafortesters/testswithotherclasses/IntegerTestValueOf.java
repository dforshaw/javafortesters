package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by david on 9/23/15.
 */
public class IntegerTestValueOf {
    @Test
    public void integerExplorationUsingIntegerValueOf() {
        String seven_string = "7";
        assertThat("convert string to Integer with valueOf for 7", Integer.valueOf(seven_string), is(7));
    }
    @Test
    public void integerExplorationUsingStringValueOf() {
        Integer seven_int = 7;
        assertEquals("convert int to string with valueOf for 7", "7", String.valueOf(seven_int));
    }
}
