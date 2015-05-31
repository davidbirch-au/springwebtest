package webtest.calculator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import webtest.calculator.CalculatorState;

public class TestCalculatorService {
	
	CalculatorService service = new CalculatorService();

	@Test
	public void testOperations() {
		
		CalculatorState state = new CalculatorState();
		
		service.doOperation(state, "Add", "1.0");
		
		Assert.assertEquals("1.0", state.getValue());
		
		service.doOperation(state, "ADD", "1.0");
		
		Assert.assertEquals("2.0", state.getValue());
		
		service.doOperation(state, "subtract", "1.0");
		
		Assert.assertEquals("1.0", state.getValue());
		
	}
	
	@Test
	public void testAdd() {
		
		CalculatorState state = new CalculatorState();
		
		service.add(state, new BigDecimal("1.00"));
		service.add(state, new BigDecimal("2.00"));
	}
	
	@Test
	public void testSubtract() {
		
		CalculatorState state = new CalculatorState();
		
		service.subtract(state, new BigDecimal("1.00"));
		service.subtract(state, new BigDecimal("2.00"));
	}
}
