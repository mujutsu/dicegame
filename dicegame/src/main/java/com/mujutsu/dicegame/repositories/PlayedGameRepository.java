package com.mujutsu.dicegame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mujutsu.dicegame.model.PlayedGame;

//@Repository("playedGameRepository")
public interface PlayedGameRepository extends JpaRepository<PlayedGame, Long> {	
//	PlayedGame findById(Long id);

}