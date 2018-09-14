package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {

    @Test
    public void clear()
    {
        // Given
        ShoppingCart cart = new ShoppingCart();

        // When
        cart.addTrack(new Track(4, "BackStreet Boyz", "Incomplete", "Pop", "img/pop.jpeg", 9));
        assertTrue(cart.getTracks().size()==1);
        cart.clear();

        // Then
        assertTrue(cart.getTracks().size()==0);
    }
}