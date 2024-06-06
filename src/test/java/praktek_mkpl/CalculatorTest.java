package praktek_mkpl;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(6, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(5, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(3, calculator.divide(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(1, 0);
    }
}
