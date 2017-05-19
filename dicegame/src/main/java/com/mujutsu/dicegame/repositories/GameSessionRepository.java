package com.mujutsu.dicegame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mujutsu.dicegame.model.GameSession;

//@Repository("gameSessionRepository")
public interface GameSessionRepository extends JpaRepository<GameSession, Long> {	
//	GameSession findById(Long id);
}
