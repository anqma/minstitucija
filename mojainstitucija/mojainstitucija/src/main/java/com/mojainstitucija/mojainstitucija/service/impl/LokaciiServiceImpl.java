package com.mojainstitucija.mojainstitucija.service.impl;

import com.mojainstitucija.mojainstitucija.model.Lokacii;
import com.mojainstitucija.mojainstitucija.repository.jpa.LokaciiRepository;
import com.mojainstitucija.mojainstitucija.service.LokaciiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LokaciiServiceImpl implements LokaciiService {
    private final LokaciiRepository lokaciiRepository;


    public LokaciiServiceImpl(LokaciiRepository lokaciiRepository) {
        this.lokaciiRepository = lokaciiRepository;
    }

    @Override
    public List<Lokacii> findAll() {
        return lokaciiRepository.findAll();
    }

    @Override
    public Optional<Lokacii> findByName(String name) {
        return lokaciiRepository.findByName(name);
    }
}
