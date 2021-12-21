package com.mojainstitucija.mojainstitucija.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Kategorija {

    @Id
    public String name;

    @ManyToMany
    public List<Usluga> uslugaList;

    public Kategorija(String name, List<Usluga> uslugaList) {
        this.name = name;
        this.uslugaList = uslugaList;
    }

    public Kategorija(){
    }
}
