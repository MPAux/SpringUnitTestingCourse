package com.luv2code.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // If number is divisible by 3, print Fizz

    @DisplayName("Divisible by 3")
    @Test
    @Order(1)
    void testForDivisibleBy3() {
       String expected = "Fizz";
       assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    // If number is divisible by 5, print Buzz

    @DisplayName("Divisible by 5")
    @Test
    @Order(2)
    void testForDivisibleBy5() {
        String expected = "Buzz";
        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }

    // If number is divisible by 3 and 5, print FizzBuzz
    @DisplayName("Divisible by 3 and 5")
    @Test
    @Order(3)
    void testForDivisibleBy3And5() {
        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    // If number is NOT divisible by 3 or 5, then print the number
    @DisplayName("Not Divisible by 3 or 5")
    @Test
    @Order(4)
    void testForNotDivisibleBy3And5() {
        String expected = "1";
        assertEquals(expected, FizzBuzz.compute(1), "Should return 1");
    }
}
