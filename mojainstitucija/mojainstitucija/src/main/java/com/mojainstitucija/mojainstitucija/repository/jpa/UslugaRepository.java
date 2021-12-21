package com.mojainstitucija.mojainstitucija.repository.jpa;

import com.mojainstitucija.mojainstitucija.model.Usluga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface UslugaRepository extends JpaRepository<Usluga,String> {
    Optional<Usluga> findByName(String name);
}
