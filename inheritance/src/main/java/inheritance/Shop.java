package inheritance;


import java.util.LinkedList;


public class Shop {

    public String titleOfShop;
    public int shopBallParkPrice;
    public double workQuality;
    public LinkedList<Review> bimmerPost;

    public Shop (String ShopName, int priceCategory, double yeetReview) {

        this.titleOfShop = ShopName;
        this.shopBallParkPrice = priceCategory;
        this.workQuality = yeetReview;
        this.bimmerPost = new LinkedList<>();

    }

    // Method to create nodes for the Linked List with inputted reviews
    public void ShopAddReview(Review review) {

        this.bimmerPost.add(review);

    }

    // Method for getting Shop name
    public String getShopName() {

        return this.titleOfShop;

    }

    // Method for getting Shop affordability
    public int getShopBallParkPrice() {

        return this.shopBallParkPrice;

    }

    // Method for getting Shop ranking
    public double getQualityRanking() {

        return this.workQuality;

    }

    // Method to pull out a specific review from the Linked List
    public Object ShopAddReview(int valueOfNodeBeingChecked) {
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
    public String shopToString() {

        StringBuilder shopStr = new StringBuilder();

        shopStr.append("Name: ");
        shopStr.append(this.titleOfShop);
        shopStr.append(" :: Price Category: ");

        for (int i = 0; i < this.shopBallParkPrice; i++) {

            shopStr.append("$");

        }

        shopStr.append(" :: Star Ranking: ");
        shopStr.append(String.format("%.01f", this.workQuality));

        return shopStr.toString();

    }
}