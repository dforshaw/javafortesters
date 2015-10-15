/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 10/7/13
 * Time: 11:29 AM
 * To change this template use File | Settings | File Templates.
 */
package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;


public class IntegerTestExamples {

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
    @Test
    public void integerExplorationUsingParseInt() {
        String seven = "7";
        assertEquals("extract int from string with parseInt for 7", 7, Integer.parseInt(seven));
    }
    @Test
    public void integerExplorationUsingValueOf() {
        Integer seven_int = 7;
        String seven_string = "7";
        assertEquals("convert int to string with valueOf for 7", "7", String.valueOf(seven_int));
        assertThat("convert string to Integer with valueOf for 7", Integer.valueOf(seven_string), is(7));
    }
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
