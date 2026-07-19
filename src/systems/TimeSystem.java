package systems;

import model.Pet;

public class TimeSystem {
	
	public static void passHour(Pet pet, int hours) {
		for(int i = 0; i < hours; i++) {
			pet.changeHunger(-5);
			pet.changeEnergy(-3);
			HealthSystem.updateHealth(pet);
		}
	}

}
