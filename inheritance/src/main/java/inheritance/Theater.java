package inheritance;


import java.util.LinkedList;


public class Theater {

    public String titleOfTheater;
    public int ballParkPrice;
    public double zelpReview;
    public LinkedList<Review> IMDS;

    public Theater (String TheaterName, int priceCategory, double yeetReview) {

        this.titleOfTheater = TheaterName;
        this.ballParkPrice = priceCategory;
        this.zelpReview = yeetReview;
        this.IMDS = new LinkedList<>();

    }

    // Method to create nodes for the Linked List with inputted reviews
    public void addReview(Review review) {

        this.IMDS.add(review);

    }

    // Method for getting Theater name
    public String getTheaterName() {

        return this.titleOfTheater;

    }

    // Method for getting Theater affordability
    public int getBallParkPrice() {

        return this.ballParkPrice;

    }

    // Method for getting Theater ranking
    public double getZelpRanking() {

        return this.zelpReview;

    }

    // Method to pull out a specific review from the Linked List
    public Review getFullReview(int valueOfNodeBeingChecked) {

        if (valueOfNodeBeingChecked > this.IMDS.size() || valueOfNodeBeingChecked < 0) {

            throw new IllegalArgumentException(String.format("Value entered at %d exceeds our list length.", valueOfNodeBeingChecked));

        }

        return this.IMDS.get(valueOfNodeBeingChecked);

    }

    // Method for getting nodes in the Linked list
    public int getReviewCount() {

        return this.IMDS.size();

    }

    // Method to convert reviews to strings
    public String toString() {

        StringBuilder restaurantStr = new StringBuilder();

        restaurantStr.append("Name: ");
        restaurantStr.append(this.titleOfTheater);
        restaurantStr.append(" :: Price Category: ");

        for (int i = 0; i < this.ballParkPrice; i++) {

            restaurantStr.append("$");

        }

        restaurantStr.append(" :: Star Ranking: ");
        restaurantStr.append(String.format("%.01f", this.zelpReview));

        return restaurantStr.toString();

    }
}