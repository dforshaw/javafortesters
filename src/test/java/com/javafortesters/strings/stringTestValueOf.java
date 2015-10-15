package com.javafortesters.strings;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by david on 10/9/15.
 */
public class stringTestValueOf {

    @Test
    public void stringConvertTest3() {

        String integerStringConvert = String.valueOf(3);

        assertThat(integerStringConvert, is("3"));
    }

    @Test
    public void stringConvertTest4() {

        char[] cArray = {'2', '3'};

        assertThat("23".toCharArray(), is(cArray));
    }

    @Test
    public void canConvertBytesUTF8() throws UnsupportedEncodingException{

        byte[] b8Array = "hello there".getBytes("UTF8");

        System.out.println(b8Array.length);
    }
}
