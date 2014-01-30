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
//        this.password = password;
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (password.length() < 7) {
            throw new IllegalArgumentException("Password must be > 6 chars. Try again.");
        }

        this.password = password;
    }

    public String getPermission() {
        return "Normal";
    }
}
