package com.mojainstitucija.mojainstitucija.model.exceptions;

public class LocationNotFoundException extends RuntimeException{
    public LocationNotFoundException(String message) {
        super(message);
    }
}
