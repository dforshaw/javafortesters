package com.javafortesters.basicsofjavarevisited;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 12/20/13
 * Time: 6:11 PM
 */

public class SelectionsDecisionsTest {

    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";

        if(!url.startsWith("http")){
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void ifElseAddHttp(){
        String url = "www.seleniumsimplified.com";

        if(url.startsWith("http")){
            // do nothing -- the url is fine
        }else{
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "www.seleniumsimplified.com";

        if(url.startsWith("http")){
            // do nothing -- the url is fine
        }else{
            if(!url.startsWith("www")){
                url = "www." + url;
            }
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));

    }

    public String likelyGenderIs(String title) {
        String likelyGender;

        switch(title.toLowerCase()){
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }

        return likelyGender;
    }

}
