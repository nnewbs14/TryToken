package com.newbs.tryvcanteen;

import java.io.Serializable;

public class User implements Serializable {

    public String email;
    public String firebaseToken;

    public User(){

    }

    public User(String email, String firebaseToken) {
        this.email = email;
        this.firebaseToken = firebaseToken;
    }
}
