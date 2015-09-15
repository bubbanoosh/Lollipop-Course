package org.example.learn;

public class Player {
	private String handleName;
	private int lives;
	private int level;
	private int score;
	private Weapon weapon;
	
	public Player() {
		this.handleName = "Unknown player";
		this.lives = 3;
		this.level = 1;
		this.score = 0;
		setDefaultWeapon();
	}
	
	public Player(String handle) {
		this();
		setHandleName(handle);
	}
	
	public Player(String handle, int level) {
		this();
		setHandleName(handle);
		setLevel(level);
	}
	
	private void setDefaultWeapon() {
		this.weapon = new Weapon("Sword", 10, 20);
	}
	
	public String getHandleName() {
		return handleName;
	}
	
	public void setHandleName(String handle) {
		if(handle.length() < 3)
			return;
		
		handleName = handle;
	}
	
	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
