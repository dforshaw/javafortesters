package com.javafortesters.basicsofjavarevisited;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionTest {

    Collection<String> workdays;

    @Before
    public void setUp()  {
        workdays = new <String>ArrayList();
    }

    @Test
    public void Collection__add__size() {

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        Assert.assertEquals(5, workdays.size());
    }

    @Test
    public void Collection__add_all__size__containsAll() {

        Collection<String> daysOfWeek = new <String>ArrayList();

        daysOfWeek.addAll(workdays);

        Assert.assertEquals(workdays.size(), daysOfWeek.size());
        Assert.assertTrue(daysOfWeek.containsAll(workdays));
    }

    @Test
    public void Collection__remove__contains() {
        Collection<String> weekendDays = new <String>ArrayList();

        weekendDays.add("Saturday");
        weekendDays.add("Funday");

        weekendDays.remove("Funday");

        Assert.assertFalse(weekendDays.contains("Funday"));

        weekendDays.add("Sunday");

        Assert.assertEquals(2, weekendDays.size());
        Assert.assertTrue("Bug Fixed, Sunday is in the collection now",
                weekendDays.contains("Sunday"));
    }
}
