package webtest.calculator;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

public class CalculatorState {

	private static final Logger LOG = Logger.getLogger(CalculatorState.class);
	
	private BigDecimal currentValue = new BigDecimal("0.00");
	private String history = "";
	
	public CalculatorState() {
		LOG.info("CalculatorState.created");
		this.clear();
	}
	
	public void add(BigDecimal aValue) {
		currentValue.add(aValue); //mistake
	}
	
	public void subtract(BigDecimal aValue) {
		currentValue.subtract(aValue); //mistake
	}
	
	public BigDecimal getValue() {
		return this.currentValue;
	}
	
	public String getHistory() {
		return history;
	}
	
	public void clear() {
		currentValue = new BigDecimal("0.00");
		String history = "";
	}
	
	public void doOperation(String operation, String value) {
		
		if(operation.equals("Add")) {
			this.add(new BigDecimal(value));
		} else if (operation.equals("Subtract")) {
			this.subtract(new BigDecimal(value));
		} else if (operation.equals("Clear")) {
			this.clear();
		}
		
	}
}
