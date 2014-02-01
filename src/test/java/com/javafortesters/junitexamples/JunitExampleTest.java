package com.javafortesters.junitexamples;


import com.javafortesters.domainentities.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.Ignore;
import org.junit.Test;

public class JunitExampleTest {

    @Test
    public void thisTestWillNeverFail() {
    }

    @Test
    public void expectInvalidPasswordException1() throws InvalidPassword {
        User user = new User("username", "123");
    }

    @Ignore
    @Test (expected = InvalidPassword.class)
    public void expectInvalidPasswordException2() throws InvalidPassword {
        User user;

        try {
            user = new User("username", "123");
        } catch (InvalidPassword invalidPassword) {
            throw new InvalidPassword("Password must be > 6 chars. Try again.");
        }
    }
}
