package com.mojainstitucija.mojainstitucija.service;

import com.mojainstitucija.mojainstitucija.model.Lokacii;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface LokaciiService {
    List<Lokacii> findAll();
    Optional<Lokacii> findByName(String name);
}
