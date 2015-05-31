package webtest.calculator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import webtest.calculator.CalculatorState;

public class TestCalculatorState {
	
	@Test
	public void testOperations() {
		
		CalculatorState state = new CalculatorState();
		
		state.doOperation("Add", "1.0");
		
		Assert.assertEquals("1.0", state.getValue());
		
		state.doOperation("ADD", "1.0");
		
		Assert.assertEquals("2.0", state.getValue());
		
		state.doOperation("subtract", "1.0");
		
		Assert.assertEquals("1.0", state.getValue());
		
	}
	
	@Test
	public void testAdd() {
		
		CalculatorState state = new CalculatorState();
		
		state.add(new BigDecimal("1.00"));
		state.add(new BigDecimal("2.00"));
	}
	
	@Test
	public void testSubtract() {
		
		CalculatorState state = new CalculatorState();
		
		state.subtract(new BigDecimal("1.00"));
		state.subtract(new BigDecimal("2.00"));
	}
}
