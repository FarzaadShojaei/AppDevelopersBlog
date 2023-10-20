package com.appsdeveloperblog;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {
    Calculator calculator;
    @BeforeEach
    void BeforeEachTestMethod(){
        calculator=new Calculator();
        System.out.println("Executing @BeforeEach method");
    }
    @DisplayName("Division By Zero")
    @RepeatedTest(value = 3,name = "{displayName}. Repetition{currentRepetition} of "+ "{totalRepetition}")
    void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException(
            RepetitionInfo repetitionInfo,TestInfo testInfo){
        System.out.println("Running"+testInfo.getTestMethod().get().getName());
        System.out.println("Running Division By Zero");
        System.out.println("Repetition"+repetitionInfo.getCurrentRepetition()+ "of" + repetitionInfo.getTotalRepetitions());
        int dividend=4;
        int divisor=0;

        String expectedExceptionMessage="/ by Zero";

        //Act & Assert
        ArithmeticException actualException=assertThrows(ArithmeticException.class,()->{

            calculator.integerDivision(dividend,divisor);
        },"Division by Zero should have " );

        //Assert
        assertEquals(expectedExceptionMessage,actualException.getMessage(),"Unexpected exception Message");
    }

}
