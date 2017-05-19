package com.mujutsu.dicegame.services;

import com.mujutsu.dicegame.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
