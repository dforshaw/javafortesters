package com.javafortesters.strings;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 10/14/2015
 * Time: 2:54 PM
 */

public class stringBuilderTestExamples {

    @Test
    public void stringBuilderTestChainingExample1() {

        StringBuilder builder = new StringBuilder();

        builder.append("Hello There")
                .replace(7,11, "World")
                .delete(5,7);

        assertThat(builder.toString(), is("HelloWorld"));
    }

    @Test
    public void stringBuilderTestCapacity1() {

        StringBuilder builder = new StringBuilder();

        assertThat(builder.capacity(), is(16));
    }

    @Test
    public void stringBuilderTestCapacity2() {

        StringBuilder sblen = new StringBuilder(512);

        assertThat(sblen.capacity(), is(512));
        assertThat(sblen.toString().length(), is(0));
    }

    @Test
    public void stringBuilderTestCapacityTrim() {

        StringBuilder builder = new StringBuilder();

        builder.ensureCapacity(600);

        builder.append("A really long phrase");

//        System.out.println("capacity: " + builder.capacity());
//        System.out.println("length: " + builder.toString().length());

        assertThat(builder.capacity(), is(600));
        assertThat(builder.toString().length(), is(20));

        builder.trimToSize();

//        System.out.println("capacity: " + builder.capacity());
//        System.out.println("length: " + builder.toString().length());

        assertThat(builder.capacity(), is(20));
        assertThat(builder.toString().length(), is(20));
    }

    @Test
    public void stringBuilderTestAppend() {

        StringBuilder builder = new StringBuilder();

        builder.append("> ");
        builder.append(1);
        builder.append(" + ");
        builder.append(2);

        char[] ca = {' ', '=', ' ', '3'};

        builder.append(ca);

        assertThat(builder.toString(), is("> 1 + 2 = 3"));
    }

    @Test
    public void stringBuilderTestExercise1() {

        StringBuilder builder = new StringBuilder();
//        System.out.println(builder.capacity());

        int before = builder.capacity();

        builder.append("A super duper long phrase");
//        System.out.println(builder.capacity());

        int after = builder.capacity();

        assertThat(after, is(greaterThan(before)));
    }

    @Test
    public void stringBuilderTestInsert() {

        StringBuilder builder = new StringBuilder("123890");

        builder.insert(3, "4567");

        assertThat(builder.toString(), is("1234567890"));
    }

    @Test
    public void stringBuilderTestInsertError() {

        StringBuilder builder = new StringBuilder("123890");

        try {
            builder.insert(7, "4567");

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Error Message : " + e.getMessage());
            System.out.println("Error Stack Trace : " + e.getStackTrace());
        }

//        assertThat(builder.toString(), is("1234567890"));
    }
}
