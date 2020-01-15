package inheritance;


import java.util.LinkedList;


public class Shop {

    public String titleOfShop;
    public int ballParkPrice;
    public double zelpReview;
    public LinkedList<Review> bimmerPost;

    public Shop (String ShopName, int priceCategory, double yeetReview) {

        this.titleOfShop = ShopName;
        this.ballParkPrice = priceCategory;
        this.zelpReview = yeetReview;
        this.bimmerPost = new LinkedList<>();

    }

    // Method to create nodes for the Linked List with inputted reviews
    public void addReview(Review review) {

        this.bimmerPost.add(review);

    }

    // Method for getting Restaurant name
    public String getShopName() {

        return this.titleOfShop;

    }

    // Method for getting Restaurant affordability
    public int getBallParkPrice() {

        return this.ballParkPrice;

    }

    // Method for getting Restaurant ranking
    public double getZelpRanking() {

        return this.zelpReview;

    }

    // Method to pull out a specific review from the Linked List
    public Review getFullReview(int valueOfNodeBeingChecked) {

        if (valueOfNodeBeingChecked > this.bimmerPost.size() || valueOfNodeBeingChecked < 0) {

            throw new IllegalArgumentException(String.format("Value entered at %d exceeds our list length.", valueOfNodeBeingChecked));

        }

        return this.bimmerPost.get(valueOfNodeBeingChecked);

    }

    // Method for getting nodes in the Linked list
    public int getReviewCount() {

        return this.bimmerPost.size();

    }

    // Method to convert reviews to strings
    public String toString() {

        StringBuilder restaurantStr = new StringBuilder();

        restaurantStr.append("Name: ");
        restaurantStr.append(this.titleOfShop);
        restaurantStr.append(" :: Price Category: ");

        for (int i = 0; i < this.ballParkPrice; i++) {

            restaurantStr.append("$");

        }

        restaurantStr.append(" :: Star Ranking: ");
        restaurantStr.append(String.format("%.01f", this.zelpReview));

        return restaurantStr.toString();

    }
}