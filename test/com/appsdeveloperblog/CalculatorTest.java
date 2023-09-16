package com.appsdeveloperblog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void integerDivision() {

        Calculator calculator=new Calculator();
      int result=  calculator.integerDivision(4,2);
      assertEquals(8,result,"4/2 did of produce 2");

    }

    @Test
    void integerSubtraction(){
        Calculator calculator=new Calculator();
        int result=calculator.integerSubtraction(33,1);
        assertEquals(32,result);

    }
}