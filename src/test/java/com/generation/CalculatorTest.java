package com.generation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addTest()
    {
        assertEquals( 7, calculator.addNumbers( 5, 2 ), "La suma no pasó" );
    }


    @Test
    public void subtractTest()
    {
        assertEquals( 5, calculator.subtractNumbers( 10, 5 ), "La resta no pasó" );
    }


    @Test
    public void multiplyTest()
    {
        assertEquals( 15, calculator.multiplyNumbers( 5, 3 ), "La multiplicación no pasó" );
    }


    @Test
    public void divideTest()
    {
        assertEquals( 7, calculator.divideNumbers( 14, 2 ), "La división no pasó" );
    }

}
