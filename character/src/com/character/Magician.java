package com.character;

import com.character.inteface.MagicBehave;

public class Magician extends Character implements MagicBehave {

	int ghealth;
	int mdamage;

	public int mhealth;

	public void lightning(Character b) {
		mdamage++;
		b.gsethealth(b.ggethealth() - 1);
	}

	public void fireball(Character b) {
		mdamage++;
		b.gsethealth(b.ggethealth() - 2);

	}

	public void icestorm(Character b) {
		mdamage++;
		b.gsethealth(b.ggethealth() - 3);

	}
	
    public void mheal(Character b) {
		
		b.sethealth(b.gethealth()+2);
	}

	@Override
	public void lightning() {
	}

	@Override
	public void fireball() {
	}

	@Override
	public void icestorm() {
	}

}
