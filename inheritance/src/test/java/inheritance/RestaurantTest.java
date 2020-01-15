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

        pho_99 = new Restaurant("Pho 99", 3);

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

    // Test to get name of restaurant
    @Test public void getRestaurantNameTest() {

        String expected = "Pho 99";
        String actual = pho_99.getRestaurantName();

        assertEquals(expected, actual);

    }

    // Test to get ballpark price estimate of restaurant
    @Test public void getBallParkPriceTest() {

        int expected = 3;
        int actual = pho_99.getBallParkPrice();

        assertEquals(expected, actual);

    }

    // Test to get the review of restaurant
    @Test public void getYelpRankingTest() {

        double expected = 3.0;
        double actual = pho_99.getYelpRanking();

        assertEquals(expected, actual, .001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void restaurant_testGetReview_IllegalArg_InputValExceedsListSize() {

        pho_99.getFullReview(pho_99.getReviewCount() + 1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void restaurant_testGetReview_IllegalArg_InputValOneLessThanListSize() {

        pho_99.getFullReview(-1);

    }

    @Test public void restaurant_testToString() {

        String expected = "Name: Pho 99 :: Price Category: $$$ :: Star Ranking: 3.0";
        String actual = pho_99.toString();

        assertEquals(expected, actual);

    }
}