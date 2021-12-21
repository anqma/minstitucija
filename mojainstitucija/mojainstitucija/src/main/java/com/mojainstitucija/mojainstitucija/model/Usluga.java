package com.mojainstitucija.mojainstitucija.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Usluga{
    @Id
    public String name;

    @ManyToMany
    public List<Lokacii> locations;


    public Usluga(String name,List<Lokacii> locations) {
        this.name = name;
        this.locations = locations;
    }

    public Usluga(){
    }
}
