package com.mojainstitucija.mojainstitucija.service;

import com.mojainstitucija.mojainstitucija.model.Lokacii;
import com.mojainstitucija.mojainstitucija.model.Usluga;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UslugaService {
    List<Usluga> findAll();
    Optional<Usluga> findByName(String name);
}
