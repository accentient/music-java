package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.commons.codec.binary.Base64;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class DownloadController {
    @GetMapping(value = "/download")
    public String download(@RequestParam(name="genre", required=false, defaultValue="All") String genre, @RequestParam(name="track", required=false) String track, @RequestParam(name="cart", required=false) String encodedCart, Model model) throws IOException {
        ShoppingCart cart = new ShoppingCart();
        if (encodedCart != null)
        {
            String decodedCart = new String(Base64.decodeBase64(encodedCart));
            cart = new ObjectMapper().readValue(decodedCart, ShoppingCart.class);
        }
        List<Track> tracks = new DummyData().getTracks();
        Track first = tracks.stream().filter(x -> x.getTitle().equals(track)).findFirst().orElse(null);
        cart.addTrack(first);
        List<Track> filteredTracks = tracks.stream().filter(x -> x.getGenre().toLowerCase().equals(genre)).collect(Collectors.toList());
        List<String> genres = tracks.stream().map(Track::getGenre).distinct().collect(Collectors.toList());

        model.addAttribute("genre", genre.substring(0,1).toUpperCase() + genre.substring(1));
        model.addAttribute("genres", genres);
        model.addAttribute("tracks", filteredTracks.isEmpty() ? tracks : filteredTracks);

        model.addAttribute("cart", Base64.encodeBase64URLSafeString(new ObjectMapper().writeValueAsString(cart).getBytes()));

        return "downloads";
    }
}
