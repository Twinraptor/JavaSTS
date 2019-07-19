package com.codingdojo.objectmaster;

public class Samurai extends Human {
	public Integer Health=200;
	
	private static int noOfSamurai=0;
	
	public Samurai() {
		noOfSamurai +=1;
	}
	public void deathBlow(Human target) {
		target.takeDamage(target.getHealth());
		this.takeDamage(this.getHealth()/2);
	}
	public void meditate() {
		this.healing(this.getHealth()/2);
	}
	public static Integer howMany() {
		return noOfSamurai;
	}
		
}
