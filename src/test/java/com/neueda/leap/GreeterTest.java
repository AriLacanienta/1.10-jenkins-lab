package com.neueda.leap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreeterTest {

    @Test
    void greetIncludesName() {
        Greeter greeter = new Greeter();
        assertEquals("Good day, Priya", greeter.greet("Priya"));
    }

    @Test
    void meaninglessTest() {
        assertTrue(true);
    }
    
    @Test
    void meaninglessTest2() {
        assertFalse(false);
    }
}
