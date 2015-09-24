package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by david on 9/23/15.
 */
public class IntegerTestParseInt {
    @Test
    public void integerExplorationUsingParseInt() {
        String seven = "7";
        assertEquals("extract int from string with parseInt for 7", 7, Integer.parseInt(seven));
    }
}
