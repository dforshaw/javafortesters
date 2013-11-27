/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 11/27/13
 * Time: 12:09 AM
 */

package com.javafortesters.domainentities;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser() {
        User user = new User();
    }

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User("admin", "pA55w0rD");
        assertEquals("given username expected",
                "admin",
                user.getUsername());

        assertEquals("given password expected",
                "pA55w0rD",
                user.getPassword());
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("default username expected",
                "username",
                user.getUsername());

        assertEquals("default password expected",
                "password",
                user.getPassword());
    }
}
