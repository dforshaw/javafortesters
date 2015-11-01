package com.javafortesters.randomdata;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by david on 10/29/15.
 */
public class randomDataTestExamples {

    @Test
    public void randomDataTestMathRandom1() {

        double rnd = Math.random();

        System.out.println(
                String.format("generated %f as random number", rnd)
        );

        assertThat(rnd < 1.0d, is(true));
        assertThat(rnd >= 0.0d, is(true));
    }

    @Test
    public void randomDataTestRandomBoolean() {

        Random generate = new Random();
        Boolean rnd = generate.nextBoolean();

        System.out.println(
                String.format("generated %b as random value", rnd)
        );

        if (rnd) {
            assertThat(rnd, is(true));
            System.out.println("rnd is true");
        }
        else {
            assertThat(rnd, is(false));
            System.out.println("rnd is false");
        }
    }

    @Test
    public void randomDataTestRandomInt() {

        Random generate = new Random();
        Integer rnd = generate.nextInt();

        System.out.println(
                String.format("generated %d as random value", rnd)
        );

        assertThat(rnd < Integer.MAX_VALUE, is(true));
        assertThat(rnd >= Integer.MIN_VALUE, is(true));
    }

    @Test
    public void randomDataTestRandomIntRange() {

        Random generate = new Random();
        Integer rnd = generate.nextInt(12);

        System.out.println(
                String.format("generated %d as random value", rnd)
        );

        assertThat(rnd < 12, is(true));
        assertThat(rnd >= 0, is(true));
    }

    @Test
    public void randomDataTestRandomLong() {

        Random generate = new Random();
        Long rnd = generate.nextLong();

        System.out.println(
                String.format("generated %d as random value", rnd)
        );

        assertThat(rnd < Long.MAX_VALUE, is(true));
        assertThat(rnd >= Long.MIN_VALUE, is(true));
    }

    @Test
    public void randomDataTestRandomDouble() {

        Random generate = new Random();
        Double rnd = generate.nextDouble();

        System.out.println(
                String.format("generated %f as random value", rnd)
        );

        assertThat(rnd < Double.MAX_VALUE, is(true));
        assertThat(rnd >= Double.MIN_VALUE, is(true));
    }

    @Test
    public void randomDataTestRandomGaussian() {

        Random generate = new Random();
        Double rnd = generate.nextGaussian();

        System.out.println(
                String.format("generated %f as random value", rnd)
        );

        assertThat(rnd < Double.MAX_VALUE, is(true));
        assertThat(rnd >= Double.MIN_VALUE, is(true));
    }
}
