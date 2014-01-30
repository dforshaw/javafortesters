package com.javafortesters.inheritance;


import com.javafortesters.domainentities.AdminUser;
import com.javafortesters.domainentities.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceExampleTest {

    @Test
    public void aUserHasNormalPermissions() {

        User aUser = new User();

        assertEquals("Normal", aUser.getPermission());
    }

    @Test
    public void anAdminUserDefaultConstructor() {

        AdminUser adminUser = null;

        try {
            adminUser = new AdminUser();
        } catch(InvalidPassword e) {

        }

        assertEquals("adminuser", adminUser.getUsername());
        assertEquals("password", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }

    @Test
    public void anAdminUserHasElevatedPermissions() {
        AdminUser adminUser = null;

        try {
            adminUser = new AdminUser("admin", "Passw0rd");
        } catch(InvalidPassword e) {

        }

        assertEquals("admin", adminUser.getUsername());
        assertEquals("Passw0rd", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }
}
