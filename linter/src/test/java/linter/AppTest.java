package linter;


import org.junit.Test;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;


public class AppTest {

    // Test for gates.js
    @Test public void theGatesFilesTest() {

        App gatesCheck = new App();

        Path filePath = Paths.get("src/main/resources/gates.js");

        String expected = "Line 3: Missing semicolon. " +
                        "Line 5: Missing semicolon. " +
                        "Line 11: Missing semicolon. " +
                        "Line 13: Missing semicolon. " +
                        "Line 15: Missing semicolon. " +
                        "Line 26: Missing semicolon. " +
                        "Line 28: Missing semicolon. " +
                        "Line 32: Missing semicolon. " +
                        "Line 36: Missing semicolon. " +
                        "Line 40: Missing semicolon. " +
                        "Line 41: Missing semicolon. " +
                        "Line 50: Missing semicolon. " +
                        "Line 51: Missing semicolon. " +
                        "Line 64: Missing semicolon. " +
                        "Line 70: Missing semicolon. " +
                        "Line 71: Missing semicolon. " +
                        "Line 72: Missing semicolon. " +
                        "Line 73: Missing semicolon. " +
                        "Line 74: Missing semicolon. " +
                        "Line 76: Missing semicolon. " +
                        "Line 77: Missing semicolon. " +
                        "Line 78: Missing semicolon. " +
                        "Line 79: Missing semicolon. " +
                        "Line 80: Missing semicolon. " +
                        "Line 82: Missing semicolon. " +
                        "Line 83: Missing semicolon. " +
                        "Line 84: Missing semicolon. " +
                        "Line 85: Missing semicolon. " +
                        "Line 86: Missing semicolon. " +
                        "Line 88: Missing semicolon. " +
                        "Line 89: Missing semicolon. " +
                        "Line 90: Missing semicolon. " +
                        "Line 91: Missing semicolon. " +
                        "Line 92: Missing semicolon. " +
                        "Line 94: Missing semicolon. " +
                        "Line 95: Missing semicolon. " +
                        "Line 96: Missing semicolon. " +
                        "Line 97: Missing semicolon. " +
                        "Line 98: Missing semicolon. " +
                        "Line 99: Missing semicolon. " +
                        "Line 100: Missing semicolon. " +
                        "Line 101: Missing semicolon. ";

        String actual = gatesCheck.bugVac(filePath);

        assertEquals(expected, actual);

    }

    // Test for empty.js
    @Test public void emptyFileTest() {

        App legitNothing = new App();

        Path filePath = Paths.get("src/main/resources/empty.js");

        String expected = "";

        String actual = legitNothing.bugVac(filePath);

        assertEquals(expected, actual);

    }

    // Test for noErrors.js
    @Test public void noErrorsTest() {

        App errorsEqualsNot = new App();

        Path filePath = Paths.get("src/main/resources/noErrors.js");

        String expected = "";

        String actual = errorsEqualsNot.bugVac(filePath);

        assertEquals(expected, actual);

    }

    // Test for singleError.js
    @Test public void singleErrorTest() {

        App oneError = new App();

        Path filePath = Paths.get("src/main/resources/singleError.js");

        String expected = "Line 3: Missing semicolon. ";

        String actual = oneError.bugVac(filePath);

        assertEquals(expected, actual);

    }

    // Test for SomeErrors.js
    @Test public void someErrorsTest() {

        App coupleOfProblems = new App();

        Path filePath = Paths.get("src/main/resources/someErrors.js");

        String expected = "Line 5: Missing semicolon. " +
                        "Line 28: Missing semicolon. " +
                        "Line 49: Missing semicolon. " +
                        "Line 51: Missing semicolon. " +
                        "Line 72: Missing semicolon. " +
                        "Line 85: Missing semicolon. ";

        String actual = coupleOfProblems.bugVac(filePath);

        assertEquals(expected, actual);

    }

    // Test for muchErrors.js
    @Test public void muchErrorsTest() {

        App aAAAAAAAHHHHHHHH = new App();

        Path filePath = Paths.get("src/main/resources/muchErrors.js");

        String expected = "Line 5: Missing semicolon. " +
                        "Line 13: Missing semicolon. " +
                        "Line 15: Missing semicolon. " +
                        "Line 18: Missing semicolon. " +
                        "Line 24: Missing semicolon. " +
                        "Line 31: Missing semicolon. " +
                        "Line 39: Missing semicolon. " +
                        "Line 42: Missing semicolon. " +
                        "Line 45: Missing semicolon. " +
                        "Line 49: Missing semicolon. " +
                        "Line 64: Missing semicolon. " +
                        "Line 70: Missing semicolon. " +
                        "Line 77: Missing semicolon. " +
                        "Line 79: Missing semicolon. " +
                        "Line 82: Missing semicolon. " +
                        "Line 85: Missing semicolon. ";

        String actual = aAAAAAAAHHHHHHHH.bugVac(filePath);

        assertEquals(expected, actual);

    }

}


