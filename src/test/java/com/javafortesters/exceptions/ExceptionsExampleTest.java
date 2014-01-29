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
    public void catchANullPointerException() {
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();

//        } catch (ArithmeticException e) {
        } catch (NullPointerException e) {
//        } catch (NoSuchMethodException e) {
            age = 18;
            ageAsString = age.toString();
        }

        String yourAge = "You are " + ageAsString + " years old.";

        assertEquals("You are 18 years old.", yourAge);
    }

    @Test
    public void catchANullPointerExceptionWithMessages() {
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();

        } catch (NullPointerException e) {

            System.out.println("getMessage - " + e.getMessage());
            System.out.println("getStackTrace - " + e.getStackTrace());

            // Find out what the proper return type would be for printStackTrace()
            // System.out.println("printStackTrace - " + e.printStackTrace());

            age = 18;
            ageAsString = age.toString();
        }

        String yourAge = "You are " + ageAsString + " years old.";

        assertEquals("You are 18 years old.", yourAge);
    }

    @Test
    public void catchMoreThanOneException() {
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();

        } catch (NullPointerException e) {

            age = 18;
            ageAsString = age.toString();

        } catch (IllegalArgumentException e) {

            System.out.println("Illegal Argument: " + e.getMessage());
        }

        //String yourAge = "You are " + ageAsString + " years old.";

        //assertEquals("You are 18 years old.", yourAge);
    }

    @Test (expected = NullPointerException.class)
    public void nullPointerExceptionExpected() {
        Integer age = null;
        age.toString();
    }
}

