package systems;

import model.Pet;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveSystem {
	
	public static void save(Pet pet) {
		try {
			PrintWriter writer = new PrintWriter("pet.txt");
			writer.println("Name:" + pet.getName() + 
					"\nHealth:" + pet.getHealth() + 
					"\nHunger:" + pet.getHunger() + 
					"\nHappiness:" + pet.getHappiness() + 
					"\nEnergy:" + pet.getEnergy() + 
					"\nWeight:" + pet.getWeight() + 
					"\nAge:" + pet.getAge() + 
					"\nCoins:" + pet.getCoins());
			writer.close();
			System.out.println("Progress saved!");
		}
		catch(FileNotFoundException err) {
			System.out.println("Couldn't save the progress.");
		}
	}

}
