package com.giselle.gamecollection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giselle.gamecollection.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
