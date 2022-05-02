package org.example.machine.impl;

import java.util.HashMap;
import java.util.List;

import org.example.dto.Output;
import org.example.machine.MachineService;
import org.example.machine.beverage.Beverage;
import org.example.machine.beverage.Espresso;
import org.example.machine.exception.NoSuchBeverageException;
import org.example.machine.exception.NoSugarProvidedException;
import org.example.machine.ingredient.Ingredient;
import org.example.machine.price.PriceService;

public class MachineServiceImpl implements MachineService {

	private PriceService priceService;
	
	
	private HashMap<String, Class> beverages = new HashMap<>();

	public void init(PriceService priceService) {
		this.priceService = priceService;
		
		//load beverages and put into beverages
		
		
	}

	@Override
	public Output prepare(String input) throws NoSugarProvidedException, NoSuchBeverageException {

		int sugar = calculateSugar(input);

		Beverage beverage = determineBeverage(input);
		
		List<Ingredient> ingredients = beverage.prepare();
		
		String price = priceService.calculate(ingredients); //output with EUR or whatever
		
		Output output = new Output();
		output.setDescription(beverage.getDescription());
		output.setOutput(price);

	}

	private Beverage determineBeverage(String input) throws NoSuchBeverageException {
	
		String beverageStr = input.substring(0, input.length()-1);
		beverages.get(beverageStr);
		try {
			//using classloader load the rigth one, using map to determine class
			return new Espresso();
		} catch (Exception e) {
			throw new NoSuchBeverageException(e);
		}
		
	}

	private int calculateSugar(String input) throws NoSugarProvidedException {
		String sugarStr = input.substring(input.length() - 1);

		try {
			return Integer.valueOf(sugarStr);
		} catch (NumberFormatException e) {
			throw new NoSugarProvidedException(e);
		}
	}

}
