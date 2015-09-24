package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by david on 9/23/15.
 */
public class IntegerTestToHexString {
    @Test
    public void integerExplorationUsingToHexStringEleven() {
        int eleven = 11;
        assertEquals("convert int to Hex String for 11", "b", Integer.toHexString(eleven));
    }
    @Test
    public void integerExplorationUsingToHexStringTen() {
        int ten = 10;
        assertEquals("convert int to Hex String for 10", "a", Integer.toHexString(ten));
    }
    @Test
    public void integerExplorationUsingToHexStringThree() {
        int three = 3;
        assertEquals("convert int to Hex String for 3", "3", Integer.toHexString(three));
    }
    @Test
    public void integerExplorationUsingToHexStringTwentyOne() {
        int twentyone = 21;
        assertEquals("convert int to Hex String for 21", "15", Integer.toHexString(twentyone));
    }
}
