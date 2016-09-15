package edu.cis232.weapon;

public class LaserCannon extends Weapon {
	private int power;
	
	public LaserCannon(int power){
		super(10);
		this.power = power;
	}
	
	public void doDamage(String shipName){
		System.out.printf("%s took %d laser damage%n", shipName, power);
	}
}
