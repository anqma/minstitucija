package com.mojainstitucija.mojainstitucija.model;

public class KategorijaNotFoundException extends RuntimeException{
    public KategorijaNotFoundException(String message) {
        super(message);
    }
}
