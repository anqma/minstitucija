package com.mojainstitucija.mojainstitucija.model.exceptions;

public class KategorijaNotFoundException extends RuntimeException{
    public KategorijaNotFoundException(String message) {
        super(message);
    }
}
