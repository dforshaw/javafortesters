package com.javafortesters.junitexamples;

import com.javafortesters.domainentities.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;

public class JunitExampleTestWithRule {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void invalidPasswordThrown() throws InvalidPassword {
        expected.expect(InvalidPassword.class);
        expected.expectMessage("Password must be > 6 chars. Try again.");
        User user = new User("username", "<6");
    }

    @Test
    public void invalidPasswordThrownHamcrest() throws InvalidPassword {
        expected.expect(InvalidPassword.class);
        expected.expectMessage(containsString("Password must be > 6 chars. Try again."));
        User user = new User("username", "<6");
    }
}
