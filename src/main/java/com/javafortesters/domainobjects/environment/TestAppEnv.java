package com.javafortesters.domainobjects.environment;

/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 11/26/13
 * Time: 5:38 PM
 */

public class TestAppEnv {
    public static String DOMAIN = "192.123.0.3";
    public static String PORT = "67";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
    }
}
