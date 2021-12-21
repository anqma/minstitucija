package com.mojainstitucija.mojainstitucija.web;


import com.mojainstitucija.mojainstitucija.model.*;
import com.mojainstitucija.mojainstitucija.service.KategorijaService;
import com.mojainstitucija.mojainstitucija.service.LokaciiService;
import com.mojainstitucija.mojainstitucija.service.UslugaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/institucii")
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

    @GetMapping("/categories")
    public String getKategorii(Model model) {
        List<Kategorija> kategorijaList = kategorijaService.listCatagories();
        model.addAttribute("kategorii", kategorijaList);
        return "categories";
    }

    @GetMapping("/mapa")
    public String getMapa(Model model) {
        return "map";
    }

    @GetMapping("/service")
    public String getUslugi(@RequestParam String name, Model model) {
        Kategorija kategorija = this.kategorijaService.findByName(name).orElseThrow(() -> new KategorijaNotFoundException("Категорија со вакво име нема во системот."));
        model.addAttribute("uslugi", kategorija.getUslugaList());
        return "uslugi";
    }

    @GetMapping("/locations")
    public String getLocations(@RequestParam String name, Model model) {
        Usluga usluga = this.uslugaService.findByName(name).orElseThrow(() -> new UslugaNotFoundException("Услуга со вакво име нема во системот."));
        model.addAttribute("uslugi", usluga.getLocations());
        return "lokacii";
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
        model.addAttribute("ime", lokacija.getName());
        model.addAttribute("address", lokacija.getAddress());
        return "lokacija";
    }
}
