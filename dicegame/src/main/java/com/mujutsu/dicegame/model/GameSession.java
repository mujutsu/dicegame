package com.mujutsu.dicegame.model;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "game_session")
public class GameSession {
	@Id
	@Column(name = "game_session_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "session_start_date")
	private ZonedDateTime sessionStartDate;
	
	@Column(name = "session_end_date")
	private ZonedDateTime sessionEndDate;
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "game_session", orphanRemoval = true)
//	private List<PlayedGame> playedGameList;
	
	//@ManyToOne
//	private User user;	

	public GameSession() {		
		
	}

	public ZonedDateTime getSessionStartDate() {
		return sessionStartDate;
	}

	public void setSessionStartDate(ZonedDateTime zonedDateTime) {
		this.sessionStartDate = zonedDateTime;
	}

	public ZonedDateTime getSessionEndDate() {
		return sessionEndDate;
	}

	public void setSessionEndDate(ZonedDateTime sessionEndDate) {
		this.sessionEndDate = sessionEndDate;
	}

	/*public List<PlayedGame> getPlayedGameList() {
		return playedGameList;
	}

	public void setPlayedGameList(List<PlayedGame> playedGameList) {
		this.playedGameList = playedGameList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
*/
	public Long getId() {
		return id;
	}

}