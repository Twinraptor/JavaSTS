package com.codingdojo.objectmaster;

public class Wizard extends Human {
	private Integer health = 50;
	private Integer intelligence = 8;
	private static int noOfWizard=0;
	
	public Wizard() {
		noOfWizard +=1;
	}
	public void heal(Human target) {
		target.healing(this.intelligence);	
	}
	
	public void fireball(Human target) {
		target.takeDamage(this.intelligence*3);
	}
}
