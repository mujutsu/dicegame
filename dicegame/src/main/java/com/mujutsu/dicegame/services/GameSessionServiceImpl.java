package com.mujutsu.dicegame.services;

import com.mujutsu.dicegame.model.GameSession;
import com.mujutsu.dicegame.repositories.GameSessionRepository;

public class GameSessionServiceImpl implements GameSessionService {

	private GameSessionRepository gameSessionRepository;

	@Override
	public GameSession findGameSessionById(Long id) {
		return null;
	}

	@Override
	public void saveGameSession(GameSession session) {
		session.setSessionStartDate(session.getSessionStartDate());
		session.setSessionEndDate(session.getSessionEndDate());
//		session.setUser(session.getUser());
//		session.setPlayedGameList(session.getPlayedGameList());
		gameSessionRepository.save(session);

	}
}
