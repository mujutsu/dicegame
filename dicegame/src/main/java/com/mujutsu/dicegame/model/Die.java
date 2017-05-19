package com.mujutsu.dicegame.model;

import java.util.Random;

public class Die {
	private int numberOfSides;
	
	public Die(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
	
	//this method returns a random integer between 1 and the number of sides the die has
	public int roll() {
		Random rand = new Random();
		return rand.nextInt(numberOfSides) + 1;
		
	}

}
