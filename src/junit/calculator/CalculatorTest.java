package junit.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(5, 5)); // Expected, Actual
    }

    @Test
    void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5, 5));
    }

    @Test
    void testSubtraction(){
        Calculator calc = new Calculator();
        assertEquals(10 , calc.sub(20,10));
    }
}
