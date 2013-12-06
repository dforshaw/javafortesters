package com.javafortesters.basicsofjavarevisited;

/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 12/5/13
 * Time: 5:10 PM
 */

public class ClassExample {
    public static final String CONSTANT = "a constant string";
    public static String aClassField = "a class field";
    protected static String proField = "a class field";
    public String pubField = "a public field";
    private String privField = "a private field";
    private String name;

    public ClassExample(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
