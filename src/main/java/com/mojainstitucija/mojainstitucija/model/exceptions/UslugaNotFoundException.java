package com.mojainstitucija.mojainstitucija.model.exceptions;

public class UslugaNotFoundException extends RuntimeException{
    public UslugaNotFoundException(String message) {
        super(message);
    }
}
