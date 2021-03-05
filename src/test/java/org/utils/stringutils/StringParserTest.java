package org.utils.stringutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

/**
 * Tests the successful case: Happy path
 * 
 */
public class StringParserTest {
    @Test
    void splitString_oneSeperator_expectTwoParts() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = "Hello|World";
        String seperator = "\\|";
        List<String> stringParts = sp.splitString(inputString, seperator);
        assertEquals(2, stringParts.size());
    }

    @Test
    void splitString_nullInput_expectException() {
        StringParser sp = new StringParser();
        String inputString = null;
        String seperator = "\\|";
        assertThrows(InvalidStringInputException.class, () -> {
            sp.splitString(inputString, seperator);
        });
    }
}
