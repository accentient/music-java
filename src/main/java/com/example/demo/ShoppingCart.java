package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
    private List<Track> tracks = new ArrayList<Track>(){};
    private int totalCost = 0;

    public ShoppingCart()
    {
    }

    public List<Track> getTracks()
    {
        return tracks;
    }

    public int getTotalCost()
    {
        return totalCost;
    }

    public void addTrack(Track track)
    {
        if (track != null) {
            tracks.add(track);
            totalCost += track.getPrice();
        }
    }

    public void clear()
    {
        tracks.clear();
    }

    public void delete(Track track)
    {
        tracks.remove(track);
        totalCost -= track.getPrice();
    }

    @JsonIgnore
    public String getFormattedPrice() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        return "£" + df.format(getTotalCost() / 100.0f);
    }
}
