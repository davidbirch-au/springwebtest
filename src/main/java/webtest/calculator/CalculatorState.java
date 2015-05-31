package webtest.calculator;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

public class CalculatorState {

	private static final Logger LOG = Logger.getLogger(CalculatorState.class);
	
	protected BigDecimal currentValue = new BigDecimal("0.00");
	protected String history = "";
	
	public CalculatorState() {
		LOG.info("CalculatorState.created");
		this.clear();
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
}
