package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by david on 9/23/15.
 */
public class IntegerTestMinMax {
    @Test
    public void integerExplorationUsingMaxValue() {
        int max = 2147483647;
        assertEquals("Integer Max Value is 2147483647", max, Integer.MAX_VALUE);
    }
    @Test
    public void integerExplorationUsingMinValue() {
        int min = -2147483648;
        assertEquals("Integer Min Value is -2147483648", min, Integer.MIN_VALUE);
    }
}
