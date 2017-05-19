package com.mujutsu.dicegame.model;

import java.time.ZonedDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "played_game")
public class PlayedGame {

	@Id
	@Column(name = "game_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "game_number")
	private Integer gameNumber;

	@Column(name = "player_score")
	private Integer playerScore;
	
	@Column(name = "npc_score")
	private Integer npcScore;
	
	@Column(name = "game_date")
	private ZonedDateTime gameDate;
	
//	@ManyToOne
//	private GameSession gameSession;

	public PlayedGame() {
		
	}

	public Integer getGameNumber() {
		return gameNumber;
	}

	public void setGameNumber(Integer gameNumber) {
		this.gameNumber = gameNumber;
	}

	public Integer getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(Integer playerScore) {
		this.playerScore = playerScore;
	}

	public Integer getNpcScore() {
		return npcScore;
	}

	public void setNpcScore(Integer npcScore) {
		this.npcScore = npcScore;
	}

	public ZonedDateTime getGameDate() {
		return gameDate;
	}

	public void setGameDate(ZonedDateTime zonedDateTime) {
		this.gameDate = zonedDateTime;
	}

	/*public GameSession getGameSession() {
		return gameSession;
	}

	public void setGameSession(GameSession gameSession) {
		this.gameSession = gameSession;
	}
*/
	public Long getId() {
		return id;
	}

}
