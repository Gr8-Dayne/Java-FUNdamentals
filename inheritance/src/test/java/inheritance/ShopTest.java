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

    @Test public void getShopNameTest() {
        String expected = "David's Shop";
        String actual = davidsShop.getName();
        assertEquals(expected, actual);
    }

    @Test public void getShopBallParkPriceTest() {
        int expected = 1;
        int actual = davidsShop.getPrice();
        assertEquals(expected, actual);
    }

    // Test to get the review of restaurant
    @Test public void getShopZelpRankingTest() {
        double expected = 4.7;
        double actual = davidsShop.getQuality();
        assertEquals(expected, actual, .001);
    }

    @Test public void getSpecificShopReview() {
        String expected = "Author: Ryan :: Review: The mechanic cleaned my car so well, I could eat off of it. :: Number of Stars: 5";
        String actual = davidsShop.customerFeedback.get(2).revToString();
        assertEquals(expected, actual);
    }

    @Test public void getNumberOfShopNodes() {
        System.out.println(davidsShop.getReviewCount());
        int expected = 5;
        int actual = davidsShop.getReviewCount();
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalYeetShopParameterCheck() {
        davidsShop.getFullReview(davidsShop.getReviewCount() + 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeIllegalShopParameterCheck() {
        davidsShop.getFullReview(-1);
    }

    @Test public void shop_ToStringTest() {
        String expected = "Name: David's Shop :: Price Category: $ :: Star Ranking: 4.7";
        String actual = davidsShop.toString();
        assertEquals(expected, actual);
    }
}