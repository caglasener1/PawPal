package runners;

import java.util.Scanner;

import model.Pet;
import systems.HealthSystem;
import systems.SleepSystem;
import systems.TimeSystem;
import database.FoodDatabase;

public class DeveloperRunner {
	
	public static void main(String[] args) {

		Scanner oku = new Scanner(System.in);
		System.out.println("Welcome to PawPal\n");
		System.out.println("What would you like to name your pet?\n> ");
		String name = oku.nextLine();
		Pet pet = new Pet(name);
		System.out.println("\nYour pet has been created\n");
		System.out.println(pet);
		int choice = -1;
		while (choice != 0) {
			System.out.println("""
					========== PawPal ==========

					1. Show Status
					2. Feed
					3. Sleep
					4. Wait One Hour
					0. Exit

					Choice:""");
			choice = oku.nextInt();
			switch (choice) {
			case 1:
				System.out.println(pet);
				break;
				
			case 2:
				int foodChoice;
				System.out.println("\n========== Food Choices ==========\n\n");
				for(int i = 0; i < FoodDatabase.FOODS.length; i++) {
					System.out.println( (i+1) + ". " + FoodDatabase.FOODS[i].getFoodName());	} 
				System.out.println("0. Back\n\nChoice:");
				foodChoice = oku.nextInt();
				if(foodChoice>0 && foodChoice <= FoodDatabase.FOODS.length) {
					pet.feed(FoodDatabase.FOODS[foodChoice-1]);
					HealthSystem.updateHealth(pet);
					System.out.println(pet);
				}
				else if(foodChoice == 0) {
					continue;
				}
				else {
					System.out.println("Oops, wrong number! Try again.");
				}	
				break;
				
			case 3: 
				System.out.println("How many hours should the pet sleep?\nHours:");
				int sleepHour = oku.nextInt();
				if (sleepHour > 0 && sleepHour <= 12) {
					SleepSystem.sleep(pet, sleepHour);
					System.out.println(name + " has slept for " + sleepHour + " hours.");
				}
				else
					System.out.println("Please choose between 1 to 12 hours");
				break;
				
			case 4:
				TimeSystem.passHour(pet, 1);
				System.out.println("One hour has passed!");
				System.out.println(pet);
				break;
				
			case 0:
				break;
				
			default:
				System.out.println("I think you entered the number wrong. Wanna try again? :)");
			
			} //switch ends here
				
		} //while ends here
		System.out.println("Thank you for playing PawPal!");
		oku.close();
	}
}
