package inheritance;

// Got this idea from Micah, I could do without it but I wanted to try it.
import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;


public class RestaurantTest {

    // Declare restaurant
    Restaurant pho_99;

    // Add reviews to restaurant
    @Before public void createLinkedList() {

        pho_99 = new Restaurant("Pho 99", 3, 3.0);

        Review ninetyNineReviewOne = new Review("Why are there eggs in the water?", "Greg", 1);
        Review ninetyNineReviewTwo = new Review("Pretty sure they stole my cat.", "James", 2);
        Review ninetyNineReviewThree = new Review("Most delicious Pho in my life.", "Ryan", 5);
        Review ninetyNineReviewFour = new Review("Dope atmosphere, really liked the vietnamese coffee.", "Xavier", 4);
        Review ninetyNineReviewFive = new Review("Chicken was undercooked, I spoke to the manager!", "Karen", 3);

        pho_99.addReview(ninetyNineReviewOne);
        pho_99.addReview(ninetyNineReviewTwo);
        pho_99.addReview(ninetyNineReviewThree);
        pho_99.addReview(ninetyNineReviewFour);
        pho_99.addReview(ninetyNineReviewFive);
    }

    @Test public void getResNameTest() {
        String expected = "Pho 99";
        String actual = pho_99.getName();
        assertEquals(expected, actual);
    }

    @Test public void getResBallParkPriceTest() {
        int expected = 3;
        int actual = pho_99.getPrice();
        assertEquals(expected, actual);
    }

    // Test to get the review of restaurant
    @Test public void getResZelpRankingTest() {
        double expected = 3.0;
        double actual = pho_99.getQuality();
        assertEquals(expected, actual, .001);
    }

    @Test public void getSpecificResReview() {
        String expected = "Author: Xavier :: Review: Dope atmosphere, really liked the vietnamese coffee. :: Number of Stars: 4";
        String actual = pho_99.customerFeedback.get(3).revToString();
        assertEquals(expected, actual);
    }

    @Test public void getNumberOfResNodes() {
        System.out.println(pho_99.getReviewCount());
        int expected = 5;
        int actual = pho_99.getReviewCount();
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalYeetResParameterCheck() {
        pho_99.getFullReview(pho_99.getReviewCount() + 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeIllegalResParameterCheck() {
        pho_99.getFullReview(-1);
    }

    @Test public void res_ToStringTest() {
        String expected = "Name: Pho 99 :: Price Category: $$$ :: Star Ranking: 3.0";
        String actual = pho_99.toString();
        assertEquals(expected, actual);
    }
}