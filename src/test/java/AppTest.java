package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class AppTest {

    @Test
    public void testRecommendation() {
        App r = new App();
        List<String> result = r.getRecommendations("Action");

        assertTrue(result.contains("Avengers"));
    }
}