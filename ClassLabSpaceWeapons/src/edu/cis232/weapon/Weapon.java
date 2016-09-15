package edu.cis232.weapon;

public class Weapon {
	private int weight;

	public Weapon(int weight){
		this.weight = weight;
	}
	
	int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void doDamage(String shipName){
		System.out.printf("%s damaged%n", shipName);
	}
}
