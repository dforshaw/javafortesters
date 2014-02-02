package com.javafortesters.domainentities;

public class User {
    private String username;
    private String password;

    public User(){
//        username = "username";
//        password = "password";
        this("username", "password", false);
    }

    public User(String username, String password) throws InvalidPassword {
        this.username = username;
//        this.password = password;
        setPassword(password);
    }

    private User(String username, String password, Boolean b) {

        //only call this because we don't want to throw the exception
        this.username = username;
        try {
            setPassword(password);

        } catch (InvalidPassword e) {

            throw new IllegalArgumentException("Default password incorrect", e);
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidPassword {

        if (password.length() < 7) {
            throw new InvalidPassword("Password must be > 6 chars. Try again.");
        }

        this.password = password;
    }

    public String getPermission() {
        return "Normal";
    }
}
