/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 10/5/13
 * Time: 12:00 AM
 */

package com.javafortesters.myfirsttest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstClass {
    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2 + 2 = 4", 4, answer );
    }
    @Test
    public void canSubtractTwoMinusTwo(){
        int answer = 2-2;
        assertEquals("2 - 2 = 0", 0, answer );
    }
    @Test
    public void canMultiplyTwoTimesTwo(){
        int answer = 2 * 2;
        assertEquals("2 * 2 = 4", 4, answer );
    }
    @Test
    public void canDivideFourDividedByTwo(){
        int answer = 4 / 2;
        assertEquals("4 / 2 = 2", 2, answer );
    }
    @Test
    public void canModFifteenByFour(){
        int answer = 15 % 4;
        assertEquals("15 % 4 = 3", 3, answer );
    }
}
