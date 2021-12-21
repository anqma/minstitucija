package com.mojainstitucija.mojainstitucija.service;

import com.mojainstitucija.mojainstitucija.model.Kategorija;

import java.util.List;
import java.util.Optional;

public interface KategorijaService {
    Optional<Kategorija> findByName(String name);
    List<Kategorija> listCatagories();
}
