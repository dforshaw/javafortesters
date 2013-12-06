/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 12/5/13
 * Time: 5:20 PM
 */

package com.javafortesters.basicsofjavarevisited;

import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;

public class ClassExampleTest {
    ClassExample instance = new ClassExample("bob");

    @Test
    public void variableNaming() {
        String $aString="bob";
        float $owed=10F;
        int aMount=4;
        long Amount=5;
        String A0123456789bCd$f="ugh";

        assertEquals(4, aMount);
        assertEquals(5, Amount);
        assertEquals(10.0F, $owed, 0);
        assertEquals("bob", $aString);
        assertEquals("ugh", A0123456789bCd$f);

        assertEquals(ClassExample.aClassField, "a class field");
        instance.aClassField = "changed";
        assertEquals(ClassExample.aClassField, "changed");

        assertEquals(instance.pubField, "a public field");
        instance.pubField = "amended public field";
        assertEquals(instance.pubField, "amended public field");
    }

    @Test
    public void BooleanType() {
        boolean truthy = true;
        boolean falsey = false;

        assertTrue(truthy);
        assertFalse(falsey);

        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;

        assertTrue(truthy);
        assertFalse(falsey);
    }
}
