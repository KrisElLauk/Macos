package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {

    protected ArrayList<Video> videoList;

    public VideoStore() {
        videoList = new ArrayList<>();
    }

    public void addVideo(String videoName) {
        videoList.add(new Video(videoName));
    }

    public void rating(String nameOfVideo, double rating) {
        for (int i = 0; i < videoList.toArray().length; i++) {
            if (videoList.get(i).getTitle().equals(nameOfVideo)) {
                videoList.get(i).receiveRating(rating);
            }
        }
    }

    public void checkOut(String nameOfVideo) {
        for (int i = 0; i < videoList.toArray().length; i++) {
            if (videoList.get(i).getTitle().equals(nameOfVideo)) {
                videoList.get(i).checkedOut();
            }
        }
    }

    public void returnedVideo(String nameOfVideo) {
        for (int i = 0; i < videoList.toArray().length; i++) {
            if (videoList.get(i).getTitle().equals(nameOfVideo)) {
                videoList.get(i).isReturned();
            }
        }
    }

    @Override
    public String toString() {
        return "List: " + videoList;
    }
}
