package systems;

import model.Pet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

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
	
	public static boolean hasSave() {
		File saveFile = new File("pet.txt");
		return saveFile.exists();
	}
	
	public static Pet load() {
		File saveFile = new File("pet.txt");
		try {
			Scanner sc = new Scanner(saveFile);
			String name = sc.nextLine();
			String[] array = name.split(":");
			name = array[1];
			int lineNumber = 0;
			int[] stats = new int[7];
			while(sc.hasNextLine()) {
				String[] parts = sc.nextLine().split(":");
				int value = Integer.parseInt(parts[1]);
				stats[lineNumber] = value;
				lineNumber++;
			}
			sc.close();
			return new Pet(name, stats[0], stats[1], stats[2], stats[3], stats[4], stats[5], stats[6]);
		}
		catch(FileNotFoundException err) {
			System.out.println("Couldn't load your pet :(");
			return null;
		}
		
	}

}
