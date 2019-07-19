package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
    public Gorilla(){

    }
    public Gorilla(int energy){
        this.energyLevel = energy;
    }
	
	public void throwSomethign() {
		System.out.println("Chucking rocks!");
		this.energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("Bananas have a peel");
		this.energyLevel += 10;
	}
	public void climb() {
		System.out.println("Climbing");
		this.energyLevel -= 10;
	}
}
