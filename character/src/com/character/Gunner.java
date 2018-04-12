package com.character;

import com.character.inteface.GunBehave;

public class Gunner extends Character implements GunBehave {

	public int mhealth;

	public void pistol(Character a) {

		damage++;
		a.sethealth(a.gethealth() - 1);

	}

	public void shotgun(Character a) {

		damage++;
		a.sethealth(a.gethealth() - 2);

	}

	public void bazooka(Character a) {

		damage++;
		a.sethealth(a.gethealth() - 3);

	}
	
	public void gheal(Character a) {
		
		a.sethealth(a.gethealth()+2);
	}

	@Override
	public void pistol() {
	}

	@Override
	public void shotgun() {
	}

	@Override
	public void bazooka() {
	}

}
