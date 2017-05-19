package com.mujutsu.dicegame.services;

import com.mujutsu.dicegame.model.GameSession;

public interface GameSessionService {
	
	public GameSession findGameSessionById(Long id);
	public void saveGameSession(GameSession session);

}
