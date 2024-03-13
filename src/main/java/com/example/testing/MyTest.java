package com.example.testing;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class MyTest {
    @Test
    public void testFunc() {
        String str1 = "Let's check this string";
        assertEquals("Let's check this string", str1); 
    }
}
