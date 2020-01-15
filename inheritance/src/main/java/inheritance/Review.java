package inheritance;


public class Review {

    // Attributes for the Objects
    public String reviewComment;
    public String author;
    public int rating;

    // Create Constructor
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

    // Ensure when a rating is made, that it is between 0-5
    public int setRating(int rating) {

        if (rating < 0 || rating > 5) {

            throw new IllegalArgumentException(String.format("Review must be between 0 and 5.  Review given: %d", rating));

        }

        return rating;

    }

    // Make a toString method
    public String toString() {

        StringBuilder reviewStr = new StringBuilder();

        reviewStr.append("Author: ");
        reviewStr.append(this.author);

        reviewStr.append(" :: Review: ");
        reviewStr.append(this.reviewComment);

        reviewStr.append(" :: Number of Stars: ");
        reviewStr.append(this.rating);

        return reviewStr.toString();
    }
}