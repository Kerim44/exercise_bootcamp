package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGetCondition() {
        Application myApp = new Application();
        boolean result = myApp.getCondition(true); // Pass boolean value instead of String
        assertEquals(true, result);

        result = myApp.getCondition(false); // Additional test for false condition
        assertEquals(false, result);
    }
}
