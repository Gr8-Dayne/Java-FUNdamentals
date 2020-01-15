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

        pho_99.addRestaurantReview(ninetyNineReviewOne);
        pho_99.addRestaurantReview(ninetyNineReviewTwo);
        pho_99.addRestaurantReview(ninetyNineReviewThree);
        pho_99.addRestaurantReview(ninetyNineReviewFour);
        pho_99.addRestaurantReview(ninetyNineReviewFive);

    }

    // Test to get name of restaurant
    @Test public void getRestaurantNameTest() {

        String expected = "Pho 99";
        String actual = pho_99.getRestaurantName();

        assertEquals(expected, actual);

    }

    // Test to get ballpark price estimate of restaurant
    @Test public void getResBallParkPriceTest() {

        int expected = 3;
        int actual = pho_99.getResBallParkPrice();

        assertEquals(expected, actual);

    }

    // Test to get the review of restaurant
    @Test public void getResZelpRankingTest() {

        double expected = 3.0;
        double actual = pho_99.getResZelpRanking();

        assertEquals(expected, actual, .001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalYeetResParameterCheck() {

        pho_99.getFullRestaurantReview(pho_99.getRestaurantReviewCount() + 1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeIllegalResParameterCheck() {

        pho_99.getFullRestaurantReview(-1);

    }

    @Test public void restaurant_ToStringTest() {

        String expected = "Name: Pho 99 :: Price Category: $$$ :: Star Ranking: 3.0";
        String actual = pho_99.resToString();

        assertEquals(expected, actual);

    }
}