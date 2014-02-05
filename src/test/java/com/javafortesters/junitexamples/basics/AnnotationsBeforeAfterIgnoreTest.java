package com.javafortesters.junitexamples.basics;

import org.junit.*;

public class AnnotationsBeforeAfterIgnoreTest {

    @BeforeClass
    public static void runOncePerClassBeforeAnyTests() {
        System.out.println("@BeforeClass method");
    }

    @AfterClass
    public static void runOncePerClassAfterAllTests() {
        System.out.println("@AfterClass method");
    }

    @Before
    public void runBeforeEveryTestMethod() {
        System.out.println("@Before each method");
    }

    @After
    public void runAfterEveryTestMethod() {
        System.out.println("@After each method");
    }

    @Test
    public void method1() {
        System.out.println("Method 1");
    }

    @Test
    public void method2() {
        System.out.println("Method 2");
    }

    @Ignore("Finish this -- still incomplete")
    @Test
    public void methodToIgnore() {
        System.out.println("Ignore this method");
    }
}
