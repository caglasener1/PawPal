package database;

import model.Food;

public class FoodDatabase {
	
	public static final Food[] FOODS = {
			
			/* 1.name
			 * 2.hungerRestore
			 * 3.healthEffect
			 * 4.happinessEffect
			 * 5.weight
			 * 6.cost
			 * 7.energyEffect
			 * **/

		    new Food("Apple",10,5,1,0,5,4),

		    new Food("Pet Food",12,2,3,1,7,6),

		    new Food("Treat",4,-1,8,2,10,2),
		    
		    new Food("Banana",7,4,3,0,5,7)

		};
}
