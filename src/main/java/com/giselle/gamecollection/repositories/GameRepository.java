package com.giselle.gamecollection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giselle.gamecollection.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
