package inheritance;


import java.util.LinkedList;


public class Restaurant {

    public String titleOfRestaurant;
    public int resBallParkPrice;
    public double foodQuality;
    public LinkedList<Review> customerFeedback;

    public Restaurant(String restaurantName, int priceCategory, double yeetReview) {

        this.titleOfRestaurant = restaurantName;
        this.resBallParkPrice = priceCategory;
        this.foodQuality = yeetReview;
        this.customerFeedback = new LinkedList<>();

    }

    // Method to create nodes for the Linked List with inputted reviews
    public void addRestaurantReview(Review review) {

        this.customerFeedback.add(review);

    }

    // Method for getting Restaurant name
    public String getRestaurantName() {

        return this.titleOfRestaurant;

    }

    // Method for getting Restaurant affordability
    public int getResBallParkPrice() {

        return this.resBallParkPrice;

    }

    // Method for getting Restaurant ranking
    public double getResZelpRanking() {

        return this.foodQuality;

    }

    // Method to pull out a specific review from the Linked List
    public Review getFullRestaurantReview(int valueOfNodeBeingChecked) {

        if (valueOfNodeBeingChecked > this.customerFeedback.size() || valueOfNodeBeingChecked < 0) {

            throw new IllegalArgumentException(String.format("Value entered at %d exceeds our list length.", valueOfNodeBeingChecked));

        }

        return this.customerFeedback.get(valueOfNodeBeingChecked);

    }

    // Method for getting nodes in the Linked list
    public int getRestaurantReviewCount() {

        return this.customerFeedback.size();

    }

    // Method to convert reviews to strings
    public String resToString() {

        StringBuilder restaurantStr = new StringBuilder();

        restaurantStr.append("Name: ");
        restaurantStr.append(this.titleOfRestaurant);
        restaurantStr.append(" :: Price Category: ");

        for (int i = 0; i < this.resBallParkPrice; i++) {

            restaurantStr.append("$");

        }

        restaurantStr.append(" :: Star Ranking: ");
        restaurantStr.append(String.format("%.01f", this.foodQuality));

        return restaurantStr.toString();

    }
}