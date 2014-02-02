package com.javafortesters.junitexamples;


import com.javafortesters.domainentities.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.Test;

public class JunitExampleTest {

    @Test
    public void thisTestWillNeverFail() {
    }

    @Test (expected = InvalidPassword.class)
    public void expectInvalidPasswordException() throws InvalidPassword {
        User user = new User("username", "123");
    }
}