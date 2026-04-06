package com.example;

import java.util.*;

public class App {

    public String registerUser(String name, String email, String phone) {

        
        if (name == null || !name.matches("[a-zA-Z]+")) {
            return "Invalid Name";
        }

        
        if (email == null || !email.contains("@") || !email.endsWith(".com")) {
            return "Invalid Email";
        }

        
        if (phone == null || !phone.matches("\\d{10}")) {
            return "Invalid Phone";
        }

        return "Registration Successful";
    }
}