package com.javafortesters.basicsofjavarevisited;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 1/23/14
 * Time: 11:05 AM
 */

public class print2DIntArrayTest {

    @Test
    public void print2DIntMatrix() {

        int [][] ragged2D ={{1,2,3,4},{5,6},{7,8,9}};

         IntArrayExample.print2DIntArray(ragged2D);
    }

    @Test
    public void printTriangleMatrix() {

        int [][] triangleMatrix = new int[16][];

        for (int i = 0; i < 16; i++) {
            triangleMatrix[i] = new int[i+1];
            for (int j = 0; j < i + 1; j++) {
                Arrays.fill(triangleMatrix[i], j, j + 1, j);
            }
        }
        IntArrayExample.print2DIntArray(triangleMatrix);
    }
}
