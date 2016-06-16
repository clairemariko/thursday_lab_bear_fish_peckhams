package com.codeclan.md;

public class Whale extends Mammal{

	public Whale(){
		super();
	}
	
	
	public void eat(Edible edible) {
		stomach.add(edible);
	}
	
	public void eat(FoodSource foodSource) {
		stomach.add(foodSource.getFood());
	}
}
