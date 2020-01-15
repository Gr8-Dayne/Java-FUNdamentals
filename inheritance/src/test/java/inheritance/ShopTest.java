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

        davidsShop.ShopAddReview(BMWReviewOne);
        davidsShop.ShopAddReview(BMWReviewTwo);
        davidsShop.ShopAddReview(BMWReviewThree);
        davidsShop.ShopAddReview(BMWReviewFour);
        davidsShop.ShopAddReview(BMWReviewFive);
    }

    // Trying to pull info from Shop
//    @Test public void retrieveBMWReview() {
//
//        Object expected = ("The mechanic cleaned my car so well, I could eat off of it.", "Ryan", 5);
//
//        Object ShopAddReview
//
//        assertEquals(expected, actual);
//
//    }


    // Test to get name of Shop
    @Test public void getShopNameTest() {

        String expected = "David's Shop";
        String actual = davidsShop.getShopName();

        assertEquals(expected, actual);

    }

    // Test to get ballpark price estimate of Shop
    @Test public void getShopBallParkPriceTest() {

        int expected = 1;
        int actual = davidsShop.getShopBallParkPrice();

        assertEquals(expected, actual);

    }

    // Test to get the review of Shop
    @Test public void getYelpRankingTest() {

        double expected = 4.7;
        double actual = davidsShop.getQualityRanking();

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
    @Test public void restaurant_ToStringTest() {

        String expected = "Name: David's Shop :: Price Category: $ :: Star Ranking: 4.7";
        String actual = davidsShop.shopToString();

        assertEquals(expected, actual);

    }
}