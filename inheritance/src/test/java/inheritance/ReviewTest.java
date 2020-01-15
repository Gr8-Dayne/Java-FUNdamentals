package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    Review ninetyNineReviewOne = new Review("Why are there eggs in the water?", "Greg", 1);
    Review ninetyNineReviewTwo = new Review("Pretty sure they stole my cat.", "James", 2);
    Review ninetyNineReviewThree = new Review("Most delicious Pho in my life.", "Ryan", 5);
    Review ninetyNineReviewFour = new Review("Dope atmosphere, really liked the vietnamese coffee.", "Xavier", 4);
    Review ninetyNineReviewFive = new Review("Chicken was undercooked, I spoke to the manager!", "Karen", 3);

    // See if constructor works
    @Test public void ReviewConstructorTest() {

        String expected_revCom = "Why are there eggs in the water?";
        String expected_auth = "Greg";
        int expected_numStars = 1;

        String actual_revCom = ninetyNineReviewOne.getReviewComment();
        String actual_auth = ninetyNineReviewOne.getAuthor();
        int actual_numStars = ninetyNineReviewOne.getRating();

        assertEquals(expected_revCom, actual_revCom);
        assertEquals(expected_auth, actual_auth);
        assertEquals(expected_numStars, actual_numStars);
    }

    // Test only getting the Review Comment
    @Test public void getReviewCommentTest() {
        String expected = "Dope atmosphere, really liked the vietnamese coffee.";
        String actual = ninetyNineReviewFour.getReviewComment();
        assertEquals(actual, expected);
    }

    // Test only getting the Author
    @Test public void getAuthorTest() {
        String expected = "Karen";
        String actual = ninetyNineReviewFive.getAuthor();
        assertEquals(expected, actual);
    }

    // Test only getting the Rating
    @Test public void getRatingTest() {
        int expected = 5;
        int actual = ninetyNineReviewThree.getRating();
        assertEquals(expected, actual);
    }

    // Test the limits of the reviews
    @Test(expected = IllegalArgumentException.class) public void illegalInput_TooHighTest() {
        ninetyNineReviewTwo = new Review("Pretty sure they stole my cat.", "James", 7);
    }
    @Test(expected = IllegalArgumentException.class) public void illegalInput_TooLowTest() {
        ninetyNineReviewTwo = new Review("Pretty sure they stole my cat.", "James", -7);
    }

    // Test toString method
    @Test public void revToStringTest() {
        String expected = "Author: Karen :: Review: Chicken was undercooked, I spoke to the manager! :: Number of Stars: 3";
        String actual = ninetyNineReviewFive.revToString();
        assertEquals(expected, actual);
    }
}