package com.example.test1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * JUnit 5 (Jupiter)
 */
public class AppTest {

    @BeforeEach
    public void setUp() {
        //
    }

    @Test
    @DisplayName("An exmaple test (EDIT ME)")
    public void testApp() {
        assertTrue(true);
    }

}
