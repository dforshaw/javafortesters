package com.javafortesters.randomdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by david on 10/29/15.
 */
public class randomDataTestExamples {

    @Test
    public void randomDataTestMathRandom1() {

        double rnd = Math.random();

        System.out.println(String.format("generated %f as random number", rnd));

        assertThat(rnd < 1.0d, is(true));
        assertThat(rnd >= 0.0d, is(true));
    }
}
