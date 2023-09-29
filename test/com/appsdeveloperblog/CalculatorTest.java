package com.appsdeveloperblog;

import org.junit.jupiter.api.*;

import static com.sun.tools.javac.file.JavacFileManager.getMessage;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math operations in Calculator Class")
class CalculatorTest {
    Calculator calculator;
    @BeforeAll
    static void setup(){
        System.out.println("Executing BeforeAll Method");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("Executing AfterAll Method");
    }

    @BeforeEach
    void BeforeEachTestMethod(){
        calculator=new Calculator();
        System.out.println("Executing @BeforeEach method");
    }
    @AfterEach
    void AfterEachTestMethod(){
        calculator=new Calculator();
        System.out.println("Executing @AfterEach Method");
    }

    @DisplayName("Test 4/2=2")
    @Test
    void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
        System.out.println("Running 4/2=2");
    //Arrange  //Given
        Calculator calculator=new Calculator();
        int dividend=4;
        int divisor=2;
        int expectedResult=2;


      int actualResult=  calculator.integerDivision(dividend,divisor);
      assertEquals(8,actualResult,"4/2 did of produce 2");

    }
    @Disabled("TODO: Still Need To work On IT")
    @DisplayName("Division By Zero")
    @Test
    void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException(){
        System.out.println("Running Division By Zero");
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