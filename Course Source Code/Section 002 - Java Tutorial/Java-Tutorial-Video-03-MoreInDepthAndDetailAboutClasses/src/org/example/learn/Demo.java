package org.example.learn;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player tim = new Player("Timothy");
//		tim.setNameAndLevel("Timothy", 5);
		System.out.println(tim.getHandleName());
		System.out.println(tim.getWeapon().getName());
	}

}
