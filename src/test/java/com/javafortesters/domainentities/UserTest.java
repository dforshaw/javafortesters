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

        User user = null;

        try {
            user = new User("admin", "pA55w0rD");
        } catch (InvalidPassword e) {

        }

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

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();

        try {
            user.setPassword("PaZZwor6");
        } catch (InvalidPassword e) {

        }

        assertEquals("setter password expected",
                "PaZZwor6",
                user.getPassword());
    }

    @Test
    public void shortPasswordThrowsAnException() {

        User user;

        try {
            user = new User("admin", "shorty");

//        } catch (IllegalArgumentException e) {      updated for ch 12
        } catch (InvalidPassword e) {

            System.out.println(e.getMessage());
        }
    }
}
