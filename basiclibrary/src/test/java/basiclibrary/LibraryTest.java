package basiclibrary;


import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class LibraryTest {

    Library knowledge = new Library();

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

    @Test public void lowestArrayOfArraysTest() {

        int[][] providedData = {
                {66, 64, 58, 65, 71, 57, 60}, // 63
                {57, 65, 65, 70, 72, 65, 51}, // 63.5
                {55, 54, 60, 53, 59, 57, 61}, // 57
                {65, 56, 55, 52, 55, 62, 57}  // 57.4
        };

        int[] expected = new int[]{55, 54, 60, 53, 59, 57, 61};
        int[] actual = knowledge.lowestArrayOfArrays(providedData);

        assertArrayEquals(expected, actual);

    }

    //
    // Lab 03 Tests below this
    //

    @Test public void getWeatherAnalyticsTest() {

        int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
        };

        String expected = "Never saw: 63 Never saw: 67 Never saw: 68 Never saw: 69 ";
        String actual = Library.getWeatherAnalytics(weeklyMonthTemperatures);

        assertEquals(expected, actual);

    }


    @Test public void electionTallyTest() {

        // Create empty array list
        List<String> vote = new ArrayList<>();

        // Add votes to empty array list
        vote.add("Bush");
        vote.add("Bush");
        vote.add("Bush");
        vote.add("Shrub");
        vote.add("Hedge");
        vote.add("Shrub");
        vote.add("Bush");
        vote.add("Hedge");
        vote.add("Bush");

        String expected = "Bush got the most votes.";
        String victorForActual = Library.electionTally(vote);
        String actual = victorForActual + " got the most votes.";

        assertEquals(expected, actual);

    }
}


