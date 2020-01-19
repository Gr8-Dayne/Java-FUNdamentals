package inheritance;


import java.util.LinkedList;
import java.util.function.UnaryOperator;


public class Review extends LinkedList<Review> {

    // Attributes for the Objects
    public String reviewComment;
    public String author;
    public int rating;
    public String movie;

    // Create Review Constructor
    public Review(String reviewComment, String author, int rating, String movie) {
        this.reviewComment = reviewComment;
        this.author = author;
        this.rating = setRating(rating);
        this.movie = movie;
    }

    public Review(String reviewComment, String author, int rating) {
        this.reviewComment = reviewComment;
        this.author = author;
        this.rating = setRating(rating);
    }

    // Get only Review Comment
    public String getReviewComment() {
        return this.reviewComment;
    }

    // Get only Review Author
    public String getAuthor() {
        return this.author;
    }

    // Get only Review Rating
    public int getRating() {
        return this.rating;
    }

    // Get only Review movie
    public String getMovie() {
        return this.movie;
    }

    // Ensure when a rating is made, that it is between 0-5
    public int setRating(int rating) {
        if (rating < 0 || rating > 5) {
            throw new IllegalArgumentException(String.format("Review must be between 0 and 5.  Review given: %d", rating));
        }
        return rating;
    }

    // Make a toString method
    public String revToString() {

        StringBuilder reviewStr = new StringBuilder();

        reviewStr.append("Author: ");
        reviewStr.append(this.author);

        if(this.movie != null) {
            reviewStr.append(" :: Movie Watched: ");
            reviewStr.append(this.movie);
        }else{}

        reviewStr.append(" :: Review: ");
        reviewStr.append(this.reviewComment);

        reviewStr.append(" :: Number of Stars: ");
        reviewStr.append(this.rating);

        return reviewStr.toString();

    }

    @Override
    public void replaceAll(UnaryOperator<Review> operator) {

    }
}