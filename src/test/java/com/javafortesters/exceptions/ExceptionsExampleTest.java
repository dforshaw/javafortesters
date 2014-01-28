package com.javafortesters.exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsExampleTest {

    @Test
    public void throwANullPointerException() {

//        Uncomment and comment the next line to see exception
//        Integer age = null;
        Integer age = 18;

        String ageAsString = age.toString();

        String yourAge = "You are " + ageAsString + " years old.";

        assertEquals("You are 18 years old.", yourAge);
    }
    @Test
    public void throwANullPointerException_tryCatch() {
        Integer age = null;

        String ageAsString;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        }

        String yourAge = "You are " + ageAsString + " years old.";

        assertEquals("You are 18 years old.", yourAge);
    }
}

