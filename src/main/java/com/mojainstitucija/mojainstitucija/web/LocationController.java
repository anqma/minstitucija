package com.mojainstitucija.mojainstitucija.web;


import com.mojainstitucija.mojainstitucija.model.*;
import com.mojainstitucija.mojainstitucija.model.exceptions.KategorijaNotFoundException;
import com.mojainstitucija.mojainstitucija.model.exceptions.LocationNotFoundException;
import com.mojainstitucija.mojainstitucija.model.exceptions.UslugaNotFoundException;
import com.mojainstitucija.mojainstitucija.service.KategorijaService;
import com.mojainstitucija.mojainstitucija.service.LokaciiService;
import com.mojainstitucija.mojainstitucija.service.UslugaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class LocationController {
    private final KategorijaService kategorijaService;
    private final UslugaService uslugaService;
    private final LokaciiService lokaciiService;

    public LocationController(KategorijaService kategorijaService, UslugaService uslugaService, LokaciiService lokaciiService) {
        this.kategorijaService = kategorijaService;
        this.uslugaService = uslugaService;
        this.lokaciiService = lokaciiService;
    }

    @GetMapping
    public String getMainPage(Model model) {
        return "home";
    }

    @GetMapping("/kategorii")
    public String getKategorii(Model model) {
        List<Kategorija> kategorijaList = kategorijaService.listCatagories();
        model.addAttribute("kategorii", kategorijaList);
        return "kategorii";
    }

    @GetMapping("/mapa")
    public String getMapa(Model model) {
        return "mapa";
    }


    @PostMapping("/lokacija/{name}") //id e variabilen del
    public String showLocation(@PathVariable String name, Model model) {
        Lokacii lokacija = lokaciiService.findByName(name).orElseThrow(() -> new LocationNotFoundException("Локација со ова име нема во системот"));
        String source = lokacija.getSource();
        String longitude=lokacija.getLongitude();
        String latitude=lokacija.getLatitude();
        model.addAttribute("locationLon",longitude);
        model.addAttribute("locationLat",latitude);
        model.addAttribute("source", source);
        model.addAttribute("name", lokacija.getName());
        model.addAttribute("address", lokacija.getAddress());
        return "lokacija";
    }
}
