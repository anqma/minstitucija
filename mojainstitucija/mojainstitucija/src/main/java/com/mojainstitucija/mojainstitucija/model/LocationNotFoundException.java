package com.mojainstitucija.mojainstitucija.model;

public class LocationNotFoundException extends RuntimeException{
    public LocationNotFoundException(String message) {
        super(message);
    }
}
