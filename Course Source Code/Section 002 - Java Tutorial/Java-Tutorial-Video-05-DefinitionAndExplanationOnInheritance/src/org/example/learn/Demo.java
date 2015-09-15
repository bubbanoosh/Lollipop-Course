package org.example.learn;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Enemy enemy = new Enemy(10, 3);
		System.out.println("Hitpoints: " + enemy.getHitPoints() + " lives: " + enemy.getLives());
		
		Soldier soldier = new Soldier(25, 1);
		System.out.println("Hitpoints: " + soldier.getHitPoints() + " lives: " + soldier.getLives());
		soldier.takeDamage(8);
		
	}

}
