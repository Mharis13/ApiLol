package com.Mharis13.LolApi.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.Mharis13.LolApi.models.ChampionsModel;
import com.Mharis13.LolApi.services.ChampionsService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("lolapi/api/v2/")
public class ChampionsController {
    private final ChampionsService championsService;

    public ChampionsController(ChampionsService championsService) {
        this.championsService = championsService;
    }

    @GetMapping("all")
    public ResponseEntity<List<ChampionsModel>> getAllChampions() {
        List<ChampionsModel> champions = championsService.getAllChampions();
        if (champions.isEmpty()) {
            return ResponseEntity.notFound().build();

        }

        return ResponseEntity.ok(champions);

    }

    @GetMapping("{id}")
    public ResponseEntity<ChampionsModel> getChampionById(@PathVariable int id) {
        ChampionsModel champion = championsService.getChampionById(id);

        if (champion == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(champion);
    }

    @GetMapping("/champion/{name}")
    public ResponseEntity<List<ChampionsModel>> getChampionByName(@PathVariable String name) {
        List<ChampionsModel> champion = championsService.getChampionByName(name);

        if (champion.isEmpty()) {
            return ResponseEntity.notFound().build();

        }
        return ResponseEntity.ok(champion);
    }

}
