package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testFormatWithAllParts() {

        String result = Person.format(
                "Dr.",
                "Mel",
                "B",
                "Johnson",
                "PhD");

        assertEquals("Dr. Mel B Johnson, PhD", result);
    }

    @Test
    void testFormatWithoutPrefix() {

        String result = Person.format(
                null,
                "Mel",
                "B",
                "Johnson",
                "PhD");

        assertEquals("Mel B Johnson, PhD", result);
    }

    @Test
    void testFormatWithoutMiddleName() {

        String result = Person.format(
                "Dr.",
                "Mel",
                null,
                "Johnson",
                "PhD");

        assertEquals("Dr. Mel Johnson, PhD", result);
    }

    @Test
    void testFormatWithoutSuffix() {

        String result = Person.format(
                "Dr.",
                "Mel",
                "B",
                "Johnson",
                null);

        assertEquals("Dr. Mel B Johnson", result);
    }

    @Test
    void testFormatWithOnlyFirstAndLast() {

        String result = Person.format(
                null,
                "Mel",
                null,
                "Johnson",
                null);

        assertEquals("Mel Johnson", result);
    }
}