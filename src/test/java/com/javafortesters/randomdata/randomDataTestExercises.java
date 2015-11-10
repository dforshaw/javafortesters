package com.javafortesters.randomdata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by david on 10/30/15.
 */
public class randomDataTestExercises {

    // Create @Test Methods Which Confirm Random Limits

    @Test
    public void randomDataTestExercise1() {

        ArrayList<Integer> intList = new ArrayList();
        Random generate = new Random();

        for (int i=0; i<1000; i++) {

            intList.add(i,generate.nextInt());

            System.out.println(
                    String.format("# %d: generated %d as random value", i, intList.get(i))
            );

            assertThat(intList.get(i) < Integer.MAX_VALUE, is(true));
            assertThat(intList.get(i) >= Integer.MIN_VALUE, is(true));
        }
    }

    @Test
    public void randomDataTestExercise2() {

    }

    @Test
    public void randomDataTestExercise3() {

    }

    @Test
    public void randomDataTestExercise4() {

    }

    @Test
    public void randomDataTestExercise5() {

    }
}
