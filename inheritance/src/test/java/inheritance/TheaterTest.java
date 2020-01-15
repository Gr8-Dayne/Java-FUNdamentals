package inheritance;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TheaterTest {

    // Declare Theater
    Theater BNT;

    // Add reviews to Theater
    @Before public void createLinkedList() {

        BNT = new Theater("Bill Nye's Theater", 4, 1.9);

        Review MovieReviewOne = new Review("David made my car run again! Too many BMW's though...", "Greg", 5);
        Review MovieReviewTwo = new Review("This guy can change a tire with only his feet!", "James", 5);
        Review MovieReviewThree = new Review("The mechanic cleaned my car so well, I could eat off of it.", "Ryan", 5);
        Review MovieReviewFour = new Review("They brought me some dope-ass tea while I waited.", "Xavier", 5);
        Review MovieReviewFive = new Review("I tried to speak to the manager but he WAS the 'manager'!", "Karen", 2);

        BNT.addReview(MovieReviewOne);
        BNT.addReview(MovieReviewTwo);
        BNT.addReview(MovieReviewThree);
        BNT.addReview(MovieReviewFour);
        BNT.addReview(MovieReviewFive);

    }

    // Test to get name of Theater
    @Test public void getTheaterNameTest() {

        String expected = "Bill Nye's Theater";
        String actual = BNT.getTheaterName();

        assertEquals(expected, actual);

    }

    // Test to get ballpark price estimate of Theater
    @Test public void getBallParkPriceTest() {

        int expected = 4;
        int actual = BNT.getBallParkPrice();

        assertEquals(expected, actual);

    }

    // Test to get the review of Theater
    @Test public void getZelpRankingTest() {

        double expected = 1.9;
        double actual = BNT.getZelpRanking();

        assertEquals(expected, actual, .001);

    }


    // Exceptions in case review numbers are too high/low
    @Test(expected = IllegalArgumentException.class)
    public void illegalYeetTheaterParameterCheck() {
        BNT.getFullReview(BNT.getReviewCount() + 1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void negativeIllegalTheaterParameterCheck() {
        BNT.getFullReview(-1);
    }

    // Making the data readable
    @Test public void TheaterToStringTest() {

        String expected = "Name: Bill Nye's Theater :: Price Category: $$$$ :: Star Ranking: 1.9";
        String actual = BNT.toString();

        assertEquals(expected, actual);

    }
}