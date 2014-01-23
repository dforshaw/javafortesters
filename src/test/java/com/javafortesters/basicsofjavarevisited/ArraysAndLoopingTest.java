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

    @Test
    public void arraysFill() {

        int[] tenItems = {0,0,0,0,0,1,1,1,1,1};

        Arrays.fill(tenItems, 5, 10, 2);

        assertEquals(2, tenItems[5]);
        assertEquals(2, tenItems[6]);
        assertEquals(2, tenItems[7]);
        assertEquals(2, tenItems[8]);
        assertEquals(2, tenItems[9]);
    }

    @Test
    public void arraysSort() {

        int[] outOfOrder = {9,7,8,2,4,3,6,1,5,0};

        Arrays.sort(outOfOrder);

        assertEquals(0, outOfOrder[0]);
        assertEquals(1, outOfOrder[1]);
        assertEquals(2, outOfOrder[2]);
        assertEquals(3, outOfOrder[3]);
        assertEquals(4, outOfOrder[4]);
        assertEquals(5, outOfOrder[5]);
        assertEquals(6, outOfOrder[6]);
        assertEquals(7, outOfOrder[7]);
        assertEquals(8, outOfOrder[8]);
        assertEquals(9, outOfOrder[9]);
    }

    @Test
    public void arraysMultiDim1() {

        int [][] multi = new int[4][4];

        assertEquals(4, multi[0].length);
        assertEquals(0, multi[0][1]);
    }

    @Test
    public void arraysMultiDim2() {

        int [][] multi = {  {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};

        assertEquals(1, multi[0][0]);
        assertEquals(7, multi[1][2]);
        assertEquals(12, multi[2][3]);
        assertEquals(14, multi[3][1]);
    }

    @Test
    public void arraysMulti3D() {

        int [][][] multi3D = new int[3][4][5];

        assertEquals(3, multi3D.length);
        assertEquals(4, multi3D[0].length);
        assertEquals(4, multi3D[1].length);
        assertEquals(4, multi3D[2].length);
        assertEquals(5, multi3D[0][1].length);
        assertEquals(5, multi3D[0][2].length);
        assertEquals(5, multi3D[0][3].length);
        assertEquals(0, multi3D[0][0][0]);
    }

    @Test
    public void arraysRagged1() {

        int [][] ragged2D =     {{1,2,3,4},
                                 {5,6},
                                 {7,8,9}
                                };

        assertEquals(4, ragged2D[0][3]);
        assertEquals(6, ragged2D[1][1]);
        assertEquals(7, ragged2D[2][0]);
    }

    @Test
    public void arraysRagged2() {

        int [][] ragged2D = new int[10][];

        ragged2D[0] = new int[10];
        ragged2D[1] = new int[3];
    }
}
