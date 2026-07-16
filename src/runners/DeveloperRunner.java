package runners;

import java.util.Scanner;

import model.Pet;

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
			else if (choice == 2)
				System.out.println("Feeding feature coming soon!");
			else if (choice == 3)
				System.out.println("Sleeping feature coming soon!");
			else if (choice == 4)
				//idk yet but do smth
				System.out.println("do something!!!");
			else if (choice>4 || choice<0)
				System.out.println("I think you entered the number wrong. Wanna try again? :)");
		}
		System.out.println("Thank you for playing PawPal!");
		oku.close();
	}
}
