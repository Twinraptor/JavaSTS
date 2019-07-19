package com.codingdojo.objectmaster;

public class Human {
	private Integer strength=3;
	private Integer stealth=3;
	private Integer intelligence=3;
	private Integer health=100;
	
	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getStealth() {
		return stealth;
	}

	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	public void takeDamage(Integer damage) {
		this.health -= damage;
	}
	public void attack(Human target) {
		target.takeDamage(this.strength);
	}
	public void healing(Integer heal) {
		this.health += heal;
	}
}
