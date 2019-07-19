package com.codingdojo.objectmaster;

public class Ninja extends Human {
	private Integer stealth = 10;
	
	private static int noOfNinja=0;
	
	public Ninja() {
		noOfNinja +=1;
	}
	public void steal(Human target) {
		target.takeDamage(this.stealth);
		this.healing(this.stealth);
	}
	
	public void runAway() {
		this.takeDamage(10);
	}
}
