package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by david on 9/23/15.
 */
public class IntegerTestIntValue {
    @Test
    public void integerExplorationFour() {
        Integer four = 4;
        assertEquals("intValue returns int 4", 4, four.intValue());
    }
    @Test
    public void integerExplorationFive() {
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
    }
    @Test
    public void integerExplorationSix() {
        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }
}
