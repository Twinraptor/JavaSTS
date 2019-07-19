package com.codingdojo.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Human a= new Human();
		Human b= new Human();
		System.out.println(b.getHealth());
		System.out.println(b.getStrength());
		System.out.println(b.getIntelligence());
		System.out.println(b.getStealth());
		System.out.println(a.getHealth());
		System.out.println(a.getStrength());
		System.out.println(a.getIntelligence());
		System.out.println(a.getStealth());
		a.attack(b);
		System.out.println(b.getHealth());
		System.out.println(b.getStrength());
		System.out.println(b.getIntelligence());
		System.out.println(b.getStealth());
		}
}
