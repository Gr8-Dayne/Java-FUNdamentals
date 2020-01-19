package inheritance;


import java.util.LinkedList;


public class Theater extends Restaurant {

    public Theater(String name, int price, double quality) {
        super(name, price, quality);
        this.customerFeedback = new LinkedList<>();
    }

    @Override public String toString() {

        StringBuilder theaterStr = new StringBuilder();

        theaterStr.append("Name: ");
        theaterStr.append(name);
        theaterStr.append(" :: Price Category: ");

        for (int i = 0; i < price; i++) {

            theaterStr.append("$");

        }

        theaterStr.append(" :: Star Ranking: ");
        theaterStr.append(String.format("%.01f", quality));

        return theaterStr.toString();
    }
}
