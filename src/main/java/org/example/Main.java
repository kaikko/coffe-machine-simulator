package org.example;

import java.io.Console;

import org.example.dto.Output;
import org.example.machine.MachineService;
import org.example.machine.exception.NoSugarProvidedException;
import org.example.machine.impl.MachineServiceImpl;
import org.example.machine.price.PriceService;
import org.example.machine.price.impl.PriceServiceImpl;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		PriceService priceService = new PriceServiceImpl();
		priceService.readPrices();

		MachineService machineInstance = new MachineServiceImpl();
		machineInstance.init(priceService);

		Console cnsl = System.console();

		while (true) {

			String input = cnsl.readLine("Enter command: ");
			
			
			try {
				Output output = machineInstance.prepare(input);
			} catch (NoSugarProvidedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}