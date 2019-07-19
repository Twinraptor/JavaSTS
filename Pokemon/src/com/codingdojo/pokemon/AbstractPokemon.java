package com.codingdojo.pokemon;

public class AbstractPokemon implements PokemonInterface {
	private String name;
	private Integer health;
	private String type;
	public AbstractPokemon createPokemon(String name, Integer health, String type) {
		this.name=name;
		this.health=health;
		this.type=type;
		return this;
}
