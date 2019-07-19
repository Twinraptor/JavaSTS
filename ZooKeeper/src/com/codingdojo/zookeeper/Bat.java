package com.codingdojo.zookeeper;

public class Bat extends Mammal{
	public Integer energyLevel =300;
	public void fly() {
		System.out.println("Whooosh!");
		this.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Crunch!");
		this.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("Burn!");
		this.energyLevel -= 100;
	}
	
}
