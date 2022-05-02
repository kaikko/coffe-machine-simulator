package org.example.machine;

import org.example.dto.Output;
import org.example.machine.exception.NoSuchBeverageException;
import org.example.machine.exception.NoSugarProvidedException;
import org.example.machine.price.PriceService;

public interface MachineService {

	Output prepare(String input) throws NoSugarProvidedException, NoSuchBeverageException;

	void init(PriceService priceService);

}
