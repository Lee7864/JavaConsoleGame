package com.character;

public class Character {

	int health;
	int damage;
	Gunner gunner;
	Magician magician;

	public void sethealth(int a) {
		this.health = a;
	}

	public int gethealth() {
		return this.health;
	}

	public void gsethealth(int b) {
		this.health = b;
	}

	public int ggethealth() {
		return this.health;
	}

	public void heal() {

	}

}
