package com.Mharis13.LolApi.services;

import java.util.List;

import com.Mharis13.LolApi.models.ChampionsModel;

public interface IChampionsServices {

    public List<ChampionsModel> getChampionByName(String name);

    public ChampionsModel getChampionById(int id);

    public List<ChampionsModel> getAllChampions();
}