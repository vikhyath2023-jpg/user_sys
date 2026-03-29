package com.example;

import java.util.*;

public class App {
    public List<String> getRecommendations(String userType) {
        if (userType.equals("Action")) {
            return Arrays.asList("Avengers", "Batman");
        }
        return Arrays.asList("General Movie");
    }
}