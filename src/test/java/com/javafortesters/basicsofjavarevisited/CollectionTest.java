package com.javafortesters.basicsofjavarevisited;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionTest {

    Collection<String> workdays = new <String>ArrayList();

    @Test
    public void Collection_add_size() {

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        Assert.assertEquals(5, workdays.size());
    }
}
