package edu.cis232.weapon;

public class MainApplication {

	public static void main(String[] args) {
		Torpedo torp = new Torpedo(10, 10, 100);
		LaserCannon laser = new LaserCannon(50);
		
		torp.doDamage("Space X Falcon 9");
		laser.doDamage("Apollo 13");

	}

}
