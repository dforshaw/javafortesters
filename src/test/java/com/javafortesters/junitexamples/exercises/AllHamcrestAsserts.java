package com.javafortesters.junitexamples.exercises;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


public class AllHamcrestAsserts {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    String[] testArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    Boolean falsey = false;
    Boolean truthy = true;
    String phrase1 = "abc";
    String phrase2 = "abc";
    String phrase3 = "abcd";
    String notNull = "a";
    String isNull = null;

    @Test
    public void AssertTests_is() {

        assertThat(phrase1, is(phrase2));
    }

    @Test
    public void AssertTests_equalTo() {

        assertThat(phrase1, equalTo(phrase2));
    }

    @Test
    public void AssertTests_not() {

        assertThat(falsey, is(not(truthy)));
    }

    @Test
    public void AssertTests_containsString() {

        assertThat(phrase3, containsString("bc"));
    }

    @Test
    public void AssertTests_endsWith() {

        assertThat(phrase3, endsWith("cd"));
    }

    @Test
    public void AssertTests_startsWith() {

        assertThat(phrase3, startsWith("ab"));
    }
}
