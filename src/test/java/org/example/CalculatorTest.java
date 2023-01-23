package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void checkAddition() {
        Calculator calculator = new Calculator();
        double result=calculator.add(1.00,22.0);
        Assertions.assertEquals(result,23.00);

    }

    @Test
    public void checkMultiply(){
        Calculator calculator1=new Calculator();
        double result=calculator1.multiply(1.5,3.1);
        Assertions.assertEquals(result,4.65);
    }
}
