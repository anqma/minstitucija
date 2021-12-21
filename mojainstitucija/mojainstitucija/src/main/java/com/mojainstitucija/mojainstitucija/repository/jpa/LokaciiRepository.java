package com.mojainstitucija.mojainstitucija.repository.jpa;

import com.mojainstitucija.mojainstitucija.model.Lokacii;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface LokaciiRepository extends JpaRepository<Lokacii,String> {
    Optional<Lokacii> findByName(String name);
}
