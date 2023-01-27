package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {
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
    public void checkIsPositiveTrue(){
        IsPositive number=new IsPositive();
        number.isPositive(3);
        boolean result= number.isPositive(3);
        Assertions.assertTrue(result);
    }

    @Disabled("This test must be skiped")
    @Test
    public void checkIsPositiveFalse(){
        IsPositive number=new IsPositive();
        number.isPositive(-3);
        boolean result= number.isPositive(-3);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints= {1,0,-13,17,256,Integer.MAX_VALUE})
    public void checkIsPositiveTrueParametrized(int number){
        IsPositive result=new IsPositive();
        Assertions.assertTrue(result.isPositive(number));
    }
    @ParameterizedTest
    @ValueSource(ints= {-11,-1,-13,-17,0,Integer.MIN_VALUE})
    public void checkIsPositiveFalseParametrized(int number){
        IsPositive result=new IsPositive();
        Assertions.assertFalse(result.isPositive(number));
    }

}
