package com.codingdojo.zookeeper;

public class Mammal {
	public Integer energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}

}
