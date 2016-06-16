package com.codeclan.md;

import java.util.ArrayList;

public class Peckhams implements FoodSource {
	
	ArrayList<Edible> stock = new ArrayList<Edible>();
	
	public Peckhams(){
		Fish fish = new Fish();
		Deer deer = new Deer();
		stock.add(deer);
		stock.add(fish);
	}

	public Edible getFood() {
		return stock.remove(0);
	}

	
	
}
