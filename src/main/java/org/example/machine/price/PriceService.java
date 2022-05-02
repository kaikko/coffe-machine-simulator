package org.example.machine.price;

import java.util.List;

import org.example.machine.ingredient.Ingredient;

public interface PriceService {

	void readPrices();

	String calculate(List<Ingredient> ingredients);

}
