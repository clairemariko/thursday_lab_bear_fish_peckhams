package com.codeclan.md;

import java.util.ArrayList;

public abstract class Mammal {
	
	protected String name;
	protected String type;
	protected ArrayList<Edible> stomach;
	
	public Mammal(){
		stomach = new ArrayList<Edible>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<Edible> getStomach() {
		
		return (ArrayList<Edible>) stomach.clone();
	}

}
