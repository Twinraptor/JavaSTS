package com.codingdojo.pokemon;

public interface PokemonInterface {
	Pokemon createPokemon(String name, Integer health, String type);
	String pokemonInfo(Pokemon pokemon);
	void listPokemon();
}
