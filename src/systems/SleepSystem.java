package systems;

import model.Pet;

public class SleepSystem {
	
	public static void sleep(Pet pet, int hours) {
		TimeSystem.passHour(pet, hours);
		pet.changeEnergy(hours*5);
		pet.changeHealth(hours);
	}

}
