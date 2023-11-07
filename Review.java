public class Review {
    private  String username ;
    private int rating;
    private String comment;

    public Review(){

    }
    public Review(String username, int rating, String comment) {
        this.username = username;
        this.rating = rating;
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRating() {
        return rating;
    }

    public int setRating(int rating) {
        this.rating = rating;
        return 0;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
