package model;

public class Pet {
	
	private String name; 	//User decides
	private int health; 	//Calculated from overall care (in HealthSystem.java)
	private int hunger; 	//0-100 starving to full 
	private int weight;		//1-10 underweight to overweight
	private int happiness;	//0-100 higher is happier
	private int energy;		//0-100 higher is more energic
	private int age;		//hours
	private int coins;		//0+ game currency
	
	public static final int MAX_STAT = 100;
	public static final int MAX_WEIGHT = 10;
	public static final int IDEAL_WEIGHT = 5;
	
	public Pet(String name) {
		this.name = name;
		this.hunger = MAX_STAT;
		this.weight = IDEAL_WEIGHT;
		this.health = MAX_STAT;
		this.happiness = MAX_STAT;
		this.energy = MAX_STAT;
		this.age = 0;
		this.coins = 0;
	}
	
	public String getName() {
		return name;	}
	public int getHealth() {
		return health;	}
	public int getHunger() {
		return hunger;	}
	public int getWeight() {
		return weight;	}
	public int getHappiness() {
		return happiness;	}
	public int getEnergy() {
		return energy;	}
	public int getAge() {
		return age;	}
	public int getCoins() {
		return coins;	}

	
	public void changeHealth(int amount) {
		health += amount;
		health = Math.max(0, Math.min(MAX_STAT, health));
	}
	public void changeHunger(int amount) {
		hunger += amount;
		hunger = Math.max(0, Math.min(MAX_STAT, hunger));
	}
	public void changeWeight(int amount) {
		weight += amount;
		weight = Math.max(0, Math.min(MAX_WEIGHT, weight));
	}
	public void changeHappiness(int amount) {
		happiness += amount;
		happiness = Math.max(0, Math.min(MAX_STAT, happiness));
	}
	public void changeEnergy(int amount) {
		energy += amount;
		energy = Math.max(0, Math.min(MAX_STAT, energy));
	}
	public void changeAge(int amount) {
		age += amount;
		age = Math.max(0,age);
	}
	public void changeCoins(int amount) {
		coins += amount;
		coins = Math.max(0,coins);
	}
	public boolean isIdealWeight() {
		return weight == IDEAL_WEIGHT;
	}
	public String displayAge() {
		return age/24 + " days, " + age%24 + " hours";
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nHealth: " + health + "\nHunger: " + hunger 
				+ "\nWeight: " + weight + "\nHappiness: " + happiness 
				+ "\nEnergy: " + energy + "\nAge: " + displayAge() + "\nCoins: " + coins;
		}
	
	public void feed(Food food) {
		changeHunger(food.getHungerRestore());
		changeHealth(food.getHealthEffect());
		changeHappiness(food.getHappinessEffect());
		changeWeight(food.getWeightChange());
		changeCoins(-food.getFoodCost());
		changeEnergy(food.getEnergyEffect());
	}
	

	
}