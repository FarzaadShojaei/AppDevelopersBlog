package com.appsdeveloperblog;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math operations in Calculator Class")
class CalculatorTest {

    @DisplayName("Test 4/2=2")
    @Test
    void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {

        Calculator calculator=new Calculator();
      int result=  calculator.integerDivision(4,2);
      assertEquals(8,result,"4/2 did of produce 2");

    }
    @DisplayName("Division By Zero")
    @Test
    void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException(){
    fail("Not Implemented Yet");
    }

    @DisplayName("Test 33-1=32")
    @Test
    void integerSubtraction(){
        Calculator calculator=new Calculator();
       int minuend=33;
       int subtrahend=1;
       int expectedResult=32;

       int actualResult=calculator.integerSubtraction(minuend,subtrahend);
       assertEquals(expectedResult,actualResult,()->minuend+ "-" + subtrahend + "Did not Produce"+ expectedResult);

    }
}