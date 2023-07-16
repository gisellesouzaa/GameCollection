package com.giselle.gamecollection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giselle.gamecollection.dto.GameDTO;
import com.giselle.gamecollection.dto.GameMinDTO;
import com.giselle.gamecollection.entities.Game;
import com.giselle.gamecollection.projection.GameMinProjection;
import com.giselle.gamecollection.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}

	@Transactional(readOnly = true)
	public Optional<GameDTO> findById(Long id) {
		Optional<Game> game = gameRepository.findById(id);
		return game.map(GameDTO::new);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(GameMinDTO::new).toList();
	}
}
