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
        Review MovieReviewThree = new Review("I got UNLIMITED POPCORN for only $65!!!", "Ryan", 5, "Revenge of the Sith");
        Review MovieReviewFour = new Review("The movie was good, I got robbed right outside though.", "Xavier", 2);
        Review MovieReviewFive = new Review("There's no managers of any kind here.", "Karen", 3, "The Expendables 2");

        BNT.addReview(MovieReviewOne);
        BNT.addReview(MovieReviewTwo);
        BNT.addReview(MovieReviewThree);
        BNT.addReview(MovieReviewFour);
        BNT.addReview(MovieReviewFive);

    }

    @Test public void getTheaterNameTest() {
        String expected = "Bill Nye's Theater";
        String actual = BNT.getName();
        assertEquals(expected, actual);
    }

    @Test public void getTheaterBallParkPriceTest() {
        int expected = 4;
        int actual = BNT.getPrice();
        assertEquals(expected, actual);
    }

    // Test to get the review of restaurant
    @Test public void getTheaterZelpRankingTest() {
        double expected = 1.9;
        double actual = BNT.getQuality();
        assertEquals(expected, actual, .001);
    }

    @Test public void getTheaterMovieTest() {
        String expected = "Revenge of the Sith";
        String actual = BNT.customerFeedback.get(2).getMovie();
        assertEquals(expected, actual);
    }

    @Test public void getTheaterNullMovieResultTest() {
        String expected = null;
        String actual = BNT.customerFeedback.get(3).getMovie();
        assertEquals(expected, actual);
    }

    @Test public void getSpecificTheaterReview() {
        System.out.println(BNT.customerFeedback.get(4).revToString());
        String expected = "Author: Karen :: Movie Watched: The Expendables 2 :: Review: There's no managers of any kind here. :: Number of Stars: 3";
        String actual = BNT.customerFeedback.get(4).revToString();
        assertEquals(expected, actual);
    }

    @Test public void getNumberOfTheaterNodes() {
        System.out.println(BNT.getReviewCount());
        int expected = 5;
        int actual = BNT.getReviewCount();
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalYeetTheaterParameterCheck() {BNT.getFullReview(BNT.getReviewCount() + 1);}

    @Test(expected = IllegalArgumentException.class)
    public void negativeIllegalTheaterParameterCheck() {BNT.getFullReview(-1);}

    @Test public void theater_ToStringTest() {
        String expected = "Name: Bill Nye's Theater :: Price Category: $$$$ :: Star Ranking: 1.9";
        String actual = BNT.toString();
        assertEquals(expected, actual);
    }
}