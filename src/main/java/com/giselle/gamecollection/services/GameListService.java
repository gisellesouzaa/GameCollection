package com.giselle.gamecollection.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giselle.gamecollection.dto.GameListDTO;
import com.giselle.gamecollection.entities.GameList;
import com.giselle.gamecollection.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	public List<GameListDTO> findAll() {
			List<GameList> result = gameListRepository.findAll();
			return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
}
