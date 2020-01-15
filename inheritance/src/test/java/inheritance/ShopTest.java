package inheritance;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ShopTest {

    // Declare Shop
    Shop davidsShop;

    // Add reviews to Shop
    @Before public void createLinkedList() {

        davidsShop = new Shop("David's Shop", 1, 4.7);

        Review BMWReviewOne = new Review("David made my car run again! Too many BMW's though...", "Greg", 5);
        Review BMWReviewTwo = new Review("This guy can change a tire with only his feet!", "James", 5);
        Review BMWReviewThree = new Review("The mechanic cleaned my car so well, I could eat off of it.", "Ryan", 5);
        Review BMWReviewFour = new Review("They brought me some dope-ass tea while I waited.", "Xavier", 5);
        Review BMWReviewFive = new Review("I tried to speak to the manager but he WAS the 'manager'!", "Karen", 2);

        davidsShop.addReview(BMWReviewOne);
        davidsShop.addReview(BMWReviewTwo);
        davidsShop.addReview(BMWReviewThree);
        davidsShop.addReview(BMWReviewFour);
        davidsShop.addReview(BMWReviewFive);

    }

    // Test to get name of Shop
    @Test public void getShopNameTest() {

        String expected = "David's Shop";
        String actual = davidsShop.getShopName();

        assertEquals(expected, actual);

    }

    // Test to get ballpark price estimate of Shop
    @Test public void getBallParkPriceTest() {

        int expected = 1;
        int actual = davidsShop.getBallParkPrice();

        assertEquals(expected, actual);

    }

    // Test to get the review of Shop
    @Test public void getYelpRankingTest() {

        double expected = 4.7;
        double actual = davidsShop.getZelpRanking();

        assertEquals(expected, actual, .001);

    }


    // Exceptions in case review numbers are too high/low
    @Test(expected = IllegalArgumentException.class)
    public void illegalYeetShopParameterCheck() {

        davidsShop.getFullReview(davidsShop.getReviewCount() + 1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeIllegalShopParameterCheck() {

        davidsShop.getFullReview(-1);

    }

    // Making the data readable
    @Test public void ShopToStringTest() {

        String expected = "Name: David's Shop :: Price Category: $ :: Star Ranking: 4.7";
        String actual = davidsShop.toString();

        assertEquals(expected, actual);

    }
}