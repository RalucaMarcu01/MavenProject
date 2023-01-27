package org.example;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    @BeforeEach
    public void beforeEachMethod(){
        System.out.println("Before Each");
    }
    @BeforeAll
    public static void beforeAllMethod(){
        System.out.println("Before All");
    }


    @AfterEach
    public void afterEachMethod(){
        System.out.println("After Each");
    }
    @AfterAll
    public static void afterAllMethod(){
        System.out.println("After All");
    }

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
