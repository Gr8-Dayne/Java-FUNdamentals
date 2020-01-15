package inheritance;


import java.util.LinkedList;


public class Theater {

    public String titleOfTheater;
    public int theaterBallParkPrice;
    public double ticketSales;
    public LinkedList<Review> IMDS;

    public Theater (String TheaterName, int priceCategory, double yeetReview) {

        this.titleOfTheater = TheaterName;
        this.theaterBallParkPrice = priceCategory;
        this.ticketSales = yeetReview;
        this.IMDS = new LinkedList<>();

    }

    // Method to create nodes for the Linked List with inputted reviews
    public void addTheaterReview(Review review) {

        this.IMDS.add(review);

    }

    // Method for getting Theater name
    public String getTheaterName() {

        return this.titleOfTheater;

    }

    // Method for getting Theater affordability
    public int getTheaterBallParkPrice() {

        return this.theaterBallParkPrice;

    }

    // Method for getting Theater ranking
    public double getTicketSales() {

        return this.ticketSales;

    }

    // Method to pull out a specific review from the Linked List
    public Review getFullTheaterReview(int valueOfNodeBeingChecked) {

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
    public String theaterToString() {

        StringBuilder theaterStr = new StringBuilder();

        theaterStr.append("Name: ");
        theaterStr.append(this.titleOfTheater);
        theaterStr.append(" :: Price Category: ");

        for (int i = 0; i < this.theaterBallParkPrice; i++) {

            theaterStr.append("$");

        }

        theaterStr.append(" :: Star Ranking: ");
        theaterStr.append(String.format("%.01f", this.ticketSales));

        return theaterStr.toString();

    }
}