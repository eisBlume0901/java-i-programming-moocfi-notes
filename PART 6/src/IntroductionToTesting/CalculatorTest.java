package IntroductionToTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest
{
    @Test
    void calculatorInitialValueZero()
    {
        var calc = new Calculator();
        assertEquals(0, calc.getValue());
    }

    @Test
    void valueFiveWhenFiveAdded()
    {
        var calc = new Calculator();
        calc.add(5);
        assertEquals(5, calc.getValue());
    }

    @Test
    void valueMinusTwoWhenTwoSubtracted()
    {
        var calc = new Calculator();
        calc.subtract(2);
        assertEquals(-2,calc.getValue());
    }
}