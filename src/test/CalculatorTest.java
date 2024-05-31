package src.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(6, result); // Incorrect expected result
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(3, result); // Incorrect expected result
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 2);
        assertEquals(9, result); // Incorrect expected result
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(6, result); // Incorrect expected result
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 1); // Change to not divide by zero
    }
}
