package org.example.machine.beverage;

import java.util.List;

import org.example.machine.ingredient.Ingredient;

public abstract class Beverage {
	
	int sugarQty;
	
	void reserve(int sugarQty) {
		this.sugarQty = sugarQty;
	}

	
	public abstract List<Ingredient> prepare();


	public abstract String getDescription();
	
	
	
	
	
	

}
