package com.mojainstitucija.mojainstitucija.service.impl;

import com.mojainstitucija.mojainstitucija.model.Kategorija;
import com.mojainstitucija.mojainstitucija.model.exceptions.KategorijaNotFoundException;
import com.mojainstitucija.mojainstitucija.repository.jpa.KategorijaRepository;
import com.mojainstitucija.mojainstitucija.service.KategorijaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KategorijaServiceImpl implements KategorijaService {
    private final KategorijaRepository kategorijaRepository;

    public KategorijaServiceImpl(KategorijaRepository kategorijaRepository) {
        this.kategorijaRepository = kategorijaRepository;
    }

    @Override
    public Optional<Kategorija> findByName(String name) {
        return kategorijaRepository.findByName(name);
    }

    @Override
    public List<Kategorija> listCatagories() {
        return  kategorijaRepository.findAll();
    }

}
