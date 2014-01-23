package com.javafortesters.basicsofjavarevisited;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 1/22/14
 * Time: 5:01 PM
 */

public class ArraysAndLoopingTest {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void arrayComponents() {

        assertEquals("Monday", workdays[0]);
        assertEquals("Friday", workdays[4]);
    }

    @Test
    public void loopThruArrayComponents1() {

        // Collection approach

        String days = "";
        for (String workday : workdays) {
            days = days + "|" + workday;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void loopThruArrayComponents2() {

        // Traditional approach

        String days = "";
        for (int i = 0; i < 5; i++) {
            days = days + "|" + workdays[i];
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void loopThruArrayComponentsUsingLength() {

        // Traditional approach

        int wLength = workdays.length;

        String days = "";

        for (int i = 0; i < wLength; i++) {
            days = days + "|" + workdays[i];
        }

        assertEquals(5, wLength);
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void arraysCopyOfPart1() {

        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 7);

        assertEquals(null, weekDays[5]);
        assertEquals(null, weekDays[6]);

        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";

        int wLength = weekDays.length;

        String days = "";

        for (int i = 0; i < wLength; i++) {
            days = days + "|" + weekDays[i];
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday", days);
    }

    @Test
    public void arraysCopyOfPart2() {

        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 3);

        assertEquals(3, weekDays.length);
        assertEquals("Monday,Tuesday,Wednesday", weekDays[0] + "," + weekDays[1] + "," + weekDays[2]);
    }

    @Test
    public void arraysCopyOfRange1() {

        String[] weekDays = Arrays.copyOfRange(workdays, 2, 5);

        assertEquals(3, weekDays.length);
        assertEquals("Wednesday", weekDays[0]);
        assertEquals("Thursday", weekDays[1]);
        assertEquals("Friday", weekDays[2]);

        assertEquals(weekDays[0], workdays[2]);
        assertEquals(weekDays[1], workdays[3]);
        assertEquals(weekDays[2], workdays[4]);

    }

    @Test
    public void arraysCopyOfRange2() {

        String[] weekDays = Arrays.copyOfRange(workdays, 2, 7);

        assertEquals(5, weekDays.length);
        assertEquals("Wednesday", weekDays[0]);
        assertEquals("Thursday", weekDays[1]);
        assertEquals("Friday", weekDays[2]);
        assertEquals(null, weekDays[3]);
        assertEquals(null, weekDays[4]);
    }
}
