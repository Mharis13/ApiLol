package com.Mharis13.LolApi.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.Mharis13.LolApi.models.ChampionsModel;
import com.Mharis13.LolApi.repositories.ChampionsRepository;

@Service
public class ChampionsService implements IChampionsServices {

    // *Inject the dependencies */
    private final ChampionsRepository championsRepository;
    private static final Logger logger = LoggerFactory.getLogger(ChampionsService.class);

    public ChampionsService(ChampionsRepository championsRepository) {
        this.championsRepository = championsRepository;
    }

    @Override
    public List<ChampionsModel> getChampionByName(String name) {
        logger.info("Fetching champion with name: {}", name);
        List<ChampionsModel> champions = championsRepository.findChampionByName(name);
        logger.info("Found {} champions with name: {}", champions.size(), name);
        return champions;
    }

    @Override
    public List<ChampionsModel> getAllChampions() {
        logger.info("Fetching all champions");
        List<ChampionsModel> champions = championsRepository.findAll();
        logger.info("Found {} champions", champions.size());
        return champions;
    }

    // FUNCIONA?
    @Override
    public ChampionsModel getChampionById(int id) {
        ChampionsModel champion = championsRepository.findById(id).orElse(null);
        return champion;
    }

}
