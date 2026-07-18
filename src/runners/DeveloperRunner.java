package runners;

import java.util.Scanner;

import model.Pet;
import systems.HealthSystem;
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
			if (choice == 1)
				System.out.println(pet);
			
			else if (choice == 2) {
				int foodChoice = -1;
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
					// back to main menu
				}
				else {
					System.out.println("Oops, wrong number! Try again.");
				}	
			}
			
			else if (choice == 3)
				System.out.println("Sleeping feature coming soon!");
			
			else if (choice == 4) {
				pet.changeHunger(-5);
				pet.changeEnergy(-3);
				HealthSystem.updateHealth(pet);
				System.out.println("One hour has passed!");
				System.out.println(pet);
			}
			
			else 
				System.out.println("I think you entered the number wrong. Wanna try again? :)");
		}
		System.out.println("Thank you for playing PawPal!");
		oku.close();
	}
}
