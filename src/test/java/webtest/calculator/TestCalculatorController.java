package webtest.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;

public class TestCalculatorController {

	@Test
	public void testDefault() {
		
		CalculatorController controller = new CalculatorController();
		
		Model model = Mockito.mock(Model.class); 
		
		String returnValue = controller.doAction("99", "Add", model);
		
		Assert.assertEquals("calculator", returnValue);
		
	}
}
