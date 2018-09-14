package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.text.DecimalFormat;

public class Track {
    private int id;
    private String artist;
    private String title;
    private String genre;
    private String thumbnailUrl;
    private int price; // In pence

    public Track() {
    }

    public Track(int id, String artist, String title, String genre, String thumbnailUrl, int price) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.genre = genre;
        this.thumbnailUrl = thumbnailUrl;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public int getPrice(){
        return price;
    }

    @JsonIgnore
    public String getFormattedPrice() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return "£" + df.format(price / 100.0f);
    }
}
