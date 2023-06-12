package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testAppConstructor() {
        Kalkulator app1 = new Kalkulator();
        Kalkulator app2 = new Kalkulator();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage() {
        Kalkulator app = new Kalkulator();
        assertEquals("Hello World!", app.getMessage());
    }
}
