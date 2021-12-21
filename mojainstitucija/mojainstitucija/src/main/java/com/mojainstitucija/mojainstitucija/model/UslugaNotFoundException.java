package com.mojainstitucija.mojainstitucija.model;

public class UslugaNotFoundException extends RuntimeException{
    public UslugaNotFoundException(String message) {
        super(message);
    }
}
