package model;

public class Food {
	
	private String name;
	private int hungerRestore;		
	private int healthEffect;		
	private int happinessEffect;	
	private int weightChange;
	private int cost;
	private int energyEffect;
	
	public Food(String n,int hu,int he,int ha,int w,int c, int en) {
		this.name = n;
		this.hungerRestore = hu;
		this.healthEffect = he;
		this.happinessEffect = ha;
		this.weightChange = w;
		this.cost = c;
		this.energyEffect = en;
	}
	
	public String getFoodName() {
		return name;
	}
	
	public int getHungerRestore() {
		return hungerRestore;
	}
	
	public int getHealthEffect() {
		return healthEffect;
	}
	
	public int getHappinessEffect() {
		return happinessEffect;
	}
	
	public int getWeightChange() {
		return weightChange;
	}
	
	public int getFoodCost() {
		return cost;
	}
	
	public int getEnergyEffect() {
		return energyEffect;
	}
}
