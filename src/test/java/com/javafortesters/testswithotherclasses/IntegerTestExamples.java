/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 10/7/13
 * Time: 11:29 AM
 * To change this template use File | Settings | File Templates.
 */
package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerTestExamples {

    @Test
    public void integerExplorationFour() {
        Integer four = new Integer(4);
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
    @Test
    public void integerExplorationUsingParseInt() {
        String seven = "7";
        assertEquals("extract int from string with parseInt for 7", 7, Integer.parseInt(seven));
    }
    @Test
    public void integerExplorationUsingValueOf() {
        Integer seven = 7;
        assertEquals("convert int to string with valueOf for 7", "7", String.valueOf(seven));
    }
}
