/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 11/27/13
 * Time: 12:08 AM
 */

package com.javafortesters.domainentities;

public class User {
    private String username;
    private String password;

    public User(){
//        username = "username";
//        password = "password";
        this("username", "password");
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
