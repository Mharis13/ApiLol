package com.Mharis13.LolApi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Mharis13.LolApi.models.ChampionsModel;

@Repository
public interface ChampionsRepository extends JpaRepository<ChampionsModel, Integer> {
    @Query("SELECT c FROM ChampionsModel c WHERE c.nombre =  :championName")
    List<ChampionsModel> findChampionByName(@Param("championName") String championName);
}
