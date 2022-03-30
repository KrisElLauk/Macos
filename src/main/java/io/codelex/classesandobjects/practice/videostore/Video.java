package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private String title;
    private boolean flag;
    private double rating;

    public Video(String title, boolean flag, double rating) {
        this.title = title;
        this.flag = flag;
        this.rating = rating;
    }

    public Video(String title) {
        this.title = title;
    }

    public void checkedOut() {
        this.flag = true;
    }

    public void isReturned() {
        this.flag = false;
    }

    public void receiveRating(double rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setInStore(boolean add) {
        this.flag = add;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "\nMovie: " + title
                + "\nIs in store: " + flag
                + "\nUser rating: " + rating;
    }
}
