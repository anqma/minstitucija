package com.mojainstitucija.mojainstitucija.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Lokacii {
    @Id
    public String name;

    public String address;

    public String source;

    public String longitude;

    public String latitude;

    public Lokacii(String name, String address, String source, String longitude, String latitude) {
        this.name = name;
        this.address = address;
        this.source = source;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Lokacii() {
    }
}
