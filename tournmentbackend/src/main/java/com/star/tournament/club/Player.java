package com.star.tournament.club;

public abstract class Player<T> {

	
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}  
}
