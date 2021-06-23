package fr.epsi.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.Scanner;


public class CalculatorTest {

    private Calculator calculator;

   @BeforeEach
    public void init(){
        this.calculator = new Calculator ();
    }
    
    
    @Test
    public void should_add_two_numbers(){
        int a = 3;
        int b = 4;
       int result = calculator.add(a,b);
        Assertions.assertEquals(7, result);
    }



     @Test
    public void should_substract_two_numbers(){
        int a = 3;
        int b= 4;
        int result = calculator.substract(a,b);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void should_multi_two_numbers(){
        int a = 3;
        int b= 4;
        int result = calculator.multi(a,b);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void should_div_two_numbers(){
        int a = 4;
        int b= 2;
        int result = calculator.div(a,b);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void should_add_tab(){
        int nombre[] = {1,3,5,7,9};
        int result = calculator.add(nombre);
        Assertions.assertEquals(25, result);
    }
}



}
