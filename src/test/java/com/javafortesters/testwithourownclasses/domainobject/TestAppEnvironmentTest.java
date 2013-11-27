/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 11/26/13
 * Time: 5:33 PM
 */
package com.javafortesters.testwithourownclasses.domainobject;

import com.javafortesters.domainobjects.environment.TestAppEnv;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {
        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getUrl());
    }
    @Test
    public void canGetDomainAndPortStatically() {
        assertEquals("Just the Domain",
                "192.123.0.3",
                TestAppEnv.DOMAIN);
        assertEquals("Just the Port",
                "67",
                TestAppEnv.PORT);
    }
}
