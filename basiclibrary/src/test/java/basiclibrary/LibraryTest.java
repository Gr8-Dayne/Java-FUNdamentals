

package basiclibrary;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testRoll() {

        // Example roll number
        int number = 7;
        // Result array
        int[] result = Library.Roll(number);

        assertEquals(number, result.length);

    }

    @Test public void testNotContainsDuplicates() {

        // Example array
        int[] array = {10, 20, 30, 40, 50};
        // boolean check
        boolean actual = Library.ContainsDuplicates(array);

        assertFalse(actual);

    }

    @Test public void testContainsDuplicates() {

        // Example array
        int[] array = {40, 20, 30, 40, 50};
        // boolean check
        boolean actual = Library.ContainsDuplicates(array);

        assertTrue(actual);

    }

    @Test public void testAverages() {

        // Example array and expected answer
        int[] testArray = {2,4,6,8,10};
        double answer = 6;

        // The whole "delta" thing is confusing to me still
        assertEquals(answer, Library.AveragesAssemble(testArray), .1);
    }

    @Test public void testBelowAverage() {

        int[][] arrayOfArrays = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };


    }

}

//    @Test public void testCalculatingAveragesMethod() {
//
//        int[] inputArr = {2,4,5,6,8,3};
//        float actual = Library.calculatingAverages(inputArr);
//        int expected = 5;
//
//        assertEquals(expected, actual, 0.0001);
//
//    }
//
//    @Test public void testArraysOfArraysMethod() {
//
//        int[][] weeklyMonthTemperatures = {
//                {66, 64, 58, 65, 71, 57, 60},
//                {57, 65, 65, 70, 72, 65, 51},
//                {55, 54, 60, 53, 59, 57, 61},
//                {65, 56, 55, 52, 55, 62, 57}
//        };
//
//        int actual = Library.arraysOfArrays(weeklyMonthTemperatures);
//        int expected = 57;
//
//        assertEquals(expected, actual);
//
//    }


