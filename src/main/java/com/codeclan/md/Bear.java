package com.codeclan.md;

public class Bear extends Mammal{

	public Bear(){
		super();
	}

	public void eat(Edible edible) {
		stomach.add(edible);
	}
	
	public void eat(FoodSource foodSource) {
		stomach.add(foodSource.getFood());
	}
	
	
	
}
