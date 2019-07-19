package com.codingdojo.pokemon;

public class Pokemon {

	public Integer count;
	
	Pokemon(){
		count++;
	}
	
	public void attack(Pokemon pokemon) {
		pokemon.health-=10;
	}
}
