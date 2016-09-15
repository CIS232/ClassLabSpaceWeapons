package edu.cis232.weapon;

public class Torpedo extends Weapon{
	private int ammoCount;
	private int range;
	private int explosionPower;
	
	public Torpedo(int ammoCount, int range, int explosionPower){
		super(5 * ammoCount);
		this.ammoCount = ammoCount;
		this.range = range;
		this.explosionPower = explosionPower;
	}
	
	public void doDamage(String shipName){
		System.out.printf("%s took explosion damage of %d%n", shipName, explosionPower);
	}
}
