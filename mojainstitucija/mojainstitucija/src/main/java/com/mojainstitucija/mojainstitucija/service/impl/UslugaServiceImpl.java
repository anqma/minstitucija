package com.mojainstitucija.mojainstitucija.service.impl;

import com.mojainstitucija.mojainstitucija.model.Usluga;
import com.mojainstitucija.mojainstitucija.repository.jpa.UslugaRepository;
import com.mojainstitucija.mojainstitucija.service.UslugaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UslugaServiceImpl implements UslugaService {
    private final UslugaRepository uslugaRepository;

    public UslugaServiceImpl(UslugaRepository uslugaRepository) {
        this.uslugaRepository = uslugaRepository;
    }

    @Override
    public List<Usluga> findAll() {
        return uslugaRepository.findAll();
    }

    @Override
    public Optional<Usluga> findByName(String name) {
        return uslugaRepository.findByName(name);
    }
}
