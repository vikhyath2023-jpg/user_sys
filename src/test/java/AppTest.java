package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testValidRegistration() {
        App app = new App();
        String result = app.registerUser("John", "john@gmail.com", "9876543210");
        assertEquals("Registration Successful", result);
    }

    @Test
    public void testInvalidName() {
        App app = new App();
        String result = app.registerUser("John123", "john@gmail.com", "9876543210");
        assertEquals("Invalid Name", result);
    }

    @Test
    public void testInvalidEmail() {
        App app = new App();
        String result = app.registerUser("John", "john@gmail", "9876543210");
        assertEquals("Invalid Email", result);
    }

    @Test
    public void testInvalidPhone() {
        App app = new App();
        String result = app.registerUser("John", "john@gmail.com", "12345");
        assertEquals("Invalid Phone", result);
    }
}