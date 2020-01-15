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

        Review MovieReviewOne = new Review("He kept coming up to me and screaming: BILL! BILL! BILL! BILL!", "Greg", 1);
        Review MovieReviewTwo = new Review("This guy can change a tire with only his feet!", "James", 1/2);
        Review MovieReviewThree = new Review("I got UNLIMITED POPCORN for only $65!!!", "Ryan", 5);
        Review MovieReviewFour = new Review("The movie was good, I got robbed right outside though.", "Xavier", 2);
        Review MovieReviewFive = new Review("There's no managers of any kind here.", "Karen", 3);

        BNT.addTheaterReview(MovieReviewOne);
        BNT.addTheaterReview(MovieReviewTwo);
        BNT.addTheaterReview(MovieReviewThree);
        BNT.addTheaterReview(MovieReviewFour);
        BNT.addTheaterReview(MovieReviewFive);

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
        int actual = BNT.getTheaterBallParkPrice();

        assertEquals(expected, actual);

    }

    // Test to get the review of Theater
    @Test public void getZelpRankingTest() {

        double expected = 1.9;
        double actual = BNT.getTicketSales();

        assertEquals(expected, actual, .001);

    }


    // Exceptions in case review numbers are too high/low
    @Test(expected = IllegalArgumentException.class)
    public void illegalYeetTheaterParameterCheck() {
        BNT.getFullTheaterReview(BNT.getReviewCount() + 1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void negativeIllegalTheaterParameterCheck() {
        BNT.getFullTheaterReview(-1);
    }

    // Making the data readable
    @Test public void TheaterToStringTest() {

        String expected = "Name: Bill Nye's Theater :: Price Category: $$$$ :: Star Ranking: 1.9";
        String actual = BNT.theaterToString();

        assertEquals(expected, actual);

    }
}