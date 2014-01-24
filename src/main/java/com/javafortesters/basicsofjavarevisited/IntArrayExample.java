package com.javafortesters.basicsofjavarevisited;

/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 1/23/14
 * Time: 10:55 AM
 */

public class IntArrayExample {
    //     print2DIntArray
    public static void print2DIntArray(int[][] multi) {

        for (int[] outer : multi) {
            if (outer == null) {
                System.out.print("null");
            } else {
                for (int inner : outer) {
                    System.out.print(inner + ",");
                }
            }

            System.out.println("");
        }
    }

    public IntArrayExample() {

    }
}
