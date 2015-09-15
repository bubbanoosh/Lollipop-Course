package org.example.learn;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player tim = new Player();
		System.out.println(tim.getHandleName());
		tim.setHandleName("Tim");
		System.out.println(tim.getHandleName());
		
		Player louise = new Player("Louise");
		System.out.println(louise.getHandleName());
		louise.setLevel(5);
		System.out.println(louise.getLevel());
		

	}

}
