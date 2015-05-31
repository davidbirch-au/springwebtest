package webtest.calculator;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

/**
 * Handles calculation services
 *
 */
@Component
public class CalculatorService {

	/**
	 * Arithmetic Add value to state
	 * 
	 * @param state
	 * @param aValue
	 */
	public void add(CalculatorState state, BigDecimal aValue) {
		state.currentValue.add(aValue); //mistake
	}

	/**
	 * Arithmetic Subtract value from state
	 * 
	 * @param state
	 * @param aValue
	 */
	public void subtract(CalculatorState state, BigDecimal aValue) {
		state.currentValue.subtract(aValue); //mistake
	}
	
	/**
	 * Execute the specified operation applying to the supplied state.
	 * 
	 * @param state
	 * @param operation
	 * @param value
	 * @throws IllegalArgumentException for bad operation/state
	 */
	public void doOperation(CalculatorState state, String operation, String value) {

		if (operation.equals("Add")) {
			this.add(state, new BigDecimal(value));
		} else if (operation.equals("Subtract")) {
			this.subtract(state, new BigDecimal(value));
		} else if (operation.equals("Clear")) {
			state.clear();
		}

	}
}
