package com.mojainstitucija.mojainstitucija.repository.jpa;

import com.mojainstitucija.mojainstitucija.model.Kategorija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface KategorijaRepository extends JpaRepository<Kategorija,String> {

    Optional<Kategorija> findByName(String name);
}
