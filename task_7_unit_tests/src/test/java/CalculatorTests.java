import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTests {
    Calculator calculator;
    public void startTests(){
        calculator = new Calculator();
        calculator.setFirstValues(1);
        calculator.setSecondValue(2);
        calculator.setOperation("-");

    }
    @Test
    public void checkOperation(){
        startTests();
        Assert.assertEquals(true, Pattern.matches("[+-/*]", calculator.getOperation()));
    }
    @Test
    public void sumMustBeEqualSumFirstValueAndSecondValue(){
        startTests();
        Assert.assertTrue(calculator.sum(calculator.getFirstValue(), calculator.getSecondValue()) == calculator.getFirstValue() + calculator.getSecondValue());

    }
    @Test
    public void SubtractMustBeEqualSubtractFirstValueAndSecondValue(){
        startTests();
        Assert.assertTrue(calculator.subtract(calculator.getFirstValue(), calculator.getSecondValue()) == calculator.getFirstValue() - calculator.getSecondValue());
    }
    @Test
    public void DivideMustBeEqualDivideFirstValueAndSecondValue(){
        startTests();
        Assert.assertTrue(calculator.divide(calculator.getFirstValue(), calculator.getSecondValue())== calculator.getFirstValue() / calculator.getSecondValue());
    }
    @Test
    public void MultiplyMustBeEqualMultiplyFirstValueAndSecondValue(){
        startTests();
        Assert.assertTrue(calculator.multiply(calculator.getFirstValue(), calculator.getSecondValue())== calculator.getFirstValue() * calculator.getSecondValue());
    }
}
