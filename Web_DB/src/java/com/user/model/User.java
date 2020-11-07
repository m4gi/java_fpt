/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.model;

/**
 *
 * @author Magi
 */
public class User {

    private int Username;
    private String Password, Name;
    private boolean Gender;

    public User() {
    }

    public User(int Username, String Password, String Name, boolean Gender) {
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.Gender = Gender;
    }

    public int getUsername() {
        return Username;
    }

    public void setUsername(int Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

}
