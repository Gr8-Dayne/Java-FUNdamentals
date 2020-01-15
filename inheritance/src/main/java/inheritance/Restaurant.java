package inheritance;


import java.util.LinkedList;


public class Restaurant {

    // Attributes for the Objects
    public String titleOfRestaurant;
    public int ballParkPrice;
    public double yelpReview;
    public LinkedList<Review> customerFeedback;

    // Create Restaurant Constructor
    public Restaurant(String restaurantName, int priceCategory) {

        this.titleOfRestaurant = restaurantName;
        this.ballParkPrice = priceCategory;
        this.yelpReview = 3.0;
        this.customerFeedback = new LinkedList<>();

    }

    // Method to create nodes for the Linked List with inputted reviews
    public void addReview(Review review) {

        this.customerFeedback.add(review);

    }

    // Method for getting Restaurant name
    public String getRestaurantName() {

        return this.titleOfRestaurant;

    }

    // Method for getting Restaurant affordability
    public int getBallParkPrice() {

        return this.ballParkPrice;

    }

    // Method for getting Restaurant ranking
    public double getYelpRanking() {

        return this.yelpReview;

    }

    // Method to pull out a specific review from the Linked List
    public Review getFullReview(int valueOfNodeBeingChecked) {

        if (valueOfNodeBeingChecked > this.customerFeedback.size() || valueOfNodeBeingChecked < 0) {

            throw new IllegalArgumentException(String.format("Value entered at %d exceeds our list length.", valueOfNodeBeingChecked));

        }

        return this.customerFeedback.get(valueOfNodeBeingChecked);

    }

    // Method for getting nodes in the Linked list
    public int getReviewCount() {

        return this.customerFeedback.size();

    }

    // Method to convert reviews to strings
    public String toString() {

        StringBuilder restaurantStr = new StringBuilder();

        restaurantStr.append("Name: ");
        restaurantStr.append(this.titleOfRestaurant);
        restaurantStr.append(" :: Price Category: ");

        for (int i = 0; i < this.ballParkPrice; i++) {

            restaurantStr.append("$");

        }

        restaurantStr.append(" :: Star Ranking: ");
        restaurantStr.append(String.format("%.01f", this.yelpReview));

        return restaurantStr.toString();

    }
}