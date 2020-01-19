package inheritance;


import java.util.LinkedList;


public class Restaurant {

    public String name;
    public int price;
    public double quality;
    public LinkedList<Review> customerFeedback;

    public Restaurant(String name, int price, double quality) {

        this.name = name;
        this.price = price;
        this.quality = quality;
        this.customerFeedback = new LinkedList<>();

    }

    // Method to create nodes for the Linked List with inputted reviews
    public void addReview(Review review) {

        this.customerFeedback.add(review);

    }

    // Method for getting Restaurant name
    public String getName() {

        return this.name;

    }

    // Method for getting Restaurant affordability
    public int getPrice() {

        return this.price;

    }

    // Method for getting Restaurant ranking
    public double getQuality() {

        return this.quality;

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
        restaurantStr.append(this.name);
        restaurantStr.append(" :: Price Category: ");

        for (int i = 0; i < this.price; i++) {

            restaurantStr.append("$");

        }

        restaurantStr.append(" :: Star Ranking: ");
        restaurantStr.append(String.format("%.01f", this.quality));

        return restaurantStr.toString();

    }
}