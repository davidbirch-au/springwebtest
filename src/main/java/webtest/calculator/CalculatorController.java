package webtest.calculator;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Spring MVC web controller for Calculator
 *
 */
@Controller
public class CalculatorController {

	private static final Logger LOG = Logger.getLogger(CalculatorController.class);
	
	protected CalculatorService calculatorService;
	
	protected CalculatorState calculatorState;
	
	public CalculatorController() {
		LOG.info("CalculatorController.created");
		this.calculatorState = new CalculatorState();
	}
	
	@RequestMapping("/calculator")
	public String show(Model model) {
		
		LOG.warn("Showing default");
		
		return "calculator";
	}
	
	@RequestMapping("/calculatorAction")
	public String doAction(
			@RequestParam(value = "value", required = false, defaultValue = "0") String value,
			@RequestParam(value = "operation", required = true) String operation,
			Model model) {
		
		System.out.println("value [" + value + "]");
		System.out.println("operation [" + operation + "]");
		
		this.calculatorService.doOperation(this.calculatorState, operation, value);
		
		model.addAttribute("currentValue", calculatorState.getValue());
		model.addAttribute("operationHistory", calculatorState.getHistory());
		
		return "calculator";
	}

}