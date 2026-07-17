package systems;

import model.Pet;

public class HealthSystem {
	
	public static void updateHealth(Pet pet) {
		int healthChange = 0;
		int hunger = pet.getHunger();
		int weight = pet.getWeight();
		int energy = pet.getEnergy();
		int happiness = pet.getHappiness();
		if(hunger < 50 && hunger >= 20)
			healthChange -= 2;
		else if(hunger < 20)
			healthChange -= 5;
		if(energy < 50 && energy >= 20)
			healthChange -= 2;
		else if(energy < 20)
			healthChange -= 5;
		if(weight == 2 || weight == 8)
			healthChange -= 2;
		else if(weight == 1 || weight == 9)
			healthChange -= 4;
		else if(weight == 10)
			healthChange -= 5;
		if(happiness < 20)
			healthChange -= 1;
		pet.changeHealth(healthChange);
	}

}
