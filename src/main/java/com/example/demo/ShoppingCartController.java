package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


@Controller
public class ShoppingCartController
{
    @GetMapping(value = "/shoppingCart")
    public String shoppingCart(@RequestParam(name="cart", required=false) String encodedCart, Model model) throws IOException
    {
        ShoppingCart shoppingcart = new ShoppingCart();
        if (encodedCart != null)
        {
            String decodedCart = new String(Base64.decodeBase64(encodedCart));
            shoppingcart = new ObjectMapper().readValue(decodedCart, ShoppingCart.class);
        }

        if(shoppingcart != null)
        {
            model.addAttribute("cartTrack", shoppingcart.getTracks());
            model.addAttribute("total", shoppingcart.getFormattedPrice());
        }
        return "shoppingCart";
    }
}
