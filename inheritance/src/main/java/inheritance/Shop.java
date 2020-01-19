package inheritance;


import java.util.LinkedList;

public class Shop extends Restaurant {

    public Shop(String name, int price, double quality) {
        super(name, price, quality);
        this.customerFeedback = new LinkedList<>();
    }

    @Override public String toString() {

        StringBuilder shopStr = new StringBuilder();

        shopStr.append("Name: ");
        shopStr.append(name);
        shopStr.append(" :: Price Category: ");

        for (int i = 0; i < price; i++) {

            shopStr.append("$");

        }

        shopStr.append(" :: Star Ranking: ");
        shopStr.append(String.format("%.01f", quality));

        return shopStr.toString();
    }
}