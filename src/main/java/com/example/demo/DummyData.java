package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DummyData {
    private List<Track> tracks = new ArrayList<>();

    public DummyData() {
        tracks.add(new Track(1, "Sean Paul", "Always on my Mind", "Pop", "img/pop.jpeg", 69));
        tracks.add(new Track(2, "James Faintleroy", "Heated", "Pop", "img/pop.jpeg", 69));
        tracks.add(new Track(3, "Jess Jaggs", "Love You", "Pop", "img/pop.jpeg", 129));
        tracks.add(new Track(4, "BackStreet Boyz", "Incomplete", "Pop", "img/pop.jpeg", 9));

        tracks.add(new Track(5, "Samuel Colt", "World of our Own", "Country", "img/country.jpeg", 59));
        tracks.add(new Track(6, "Blind Crew", "The War Is Over", "Country", "img/country.jpeg", 59));
        tracks.add(new Track(7, "Roy Colins", "Never Back-Off", "Country", "img/country.jpeg", 59));
        tracks.add(new Track(8, "Musa Ashoms", "What A Crazy Attitude", "Country", "img/country.jpeg", 59));

        tracks.add(new Track(9, "Pink Floyd", "Comfortably Numb", "Rock", "img/rock.jpeg", 129));
        tracks.add(new Track(10,"The Rolling Stones", "Start Me Up", "Rock", "img/rock.jpeg", 129));
        tracks.add(new Track(11, "Neil Young", "Rockin' in the Free World", "Rock", "img/rock.jpeg", 129));
        tracks.add(new Track(12, "Led Zeppelin", "Whole Lotta Love", "Rock", "img/rock.jpeg", 299));

        tracks.add(new Track(13,"Aaron Goldberg", "World", "Jazz", "img/jazz.jpeg", 399));
        tracks.add(new Track(14, "Aisha Duo", "Quiet Songs", "Jazz", "img/jazz.jpeg", 399));
        tracks.add(new Track(15, "James John", "You knock me", "Jazz", "img/jazz.jpeg", 299));
        tracks.add(new Track(16, "Fox Brown", "All i Ever Wanted", "Jazz", "img/jazz.jpeg", 499));

        tracks.add(new Track(17, "Habib Click", "What a Country", "Classical", "img/classical.jpeg", 159));
        tracks.add(new Track(18, "Jimmy Long", "Close the Door by", "Classical", "img/classical.jpeg", 99));
        tracks.add(new Track(19, "Forth Minor", "Freedom is coming", "Classical", "img/classical.jpeg", 99));
        tracks.add(new Track(20, "Dolls Shan", "All the Way Back", "Classical", "img/classical.jpeg", 99));

        tracks.add(new Track(21, "Joe Bermudez Featuring Louise Carver", "Crazy Enough", "Dance", "img/dance.jpeg", 299));
        tracks.add(new Track(22, "Crystal Waters, Sted-E & Hybrid Heights", "I Am House", "Dance", "img/dance.jpeg", 299));
        tracks.add(new Track(23, "Dua Lipa", "IDGAF", "Dance", "img/dance.jpeg", 199));
        tracks.add(new Track(24, "Demi Lovato", "Tell Me You Love Me", "Dance", "img/dance.jpeg", 299));
    }

    public List<Track> getTracks() {
        return tracks;
    }
}
