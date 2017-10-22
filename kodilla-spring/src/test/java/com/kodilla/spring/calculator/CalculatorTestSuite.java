package com.kodilla.spring.calculator;

//import com.kodilla.spring.SpringRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double valAdd = calculator.add(2,2);
        Double valSub = calculator.sub(2,2);
        Double valMul = calculator.mul(2,2);
        Double valDiv = calculator.div(2,2);
        //Then
        Assert.assertEquals(4, valAdd, 0.1);
        Assert.assertEquals(0, valSub, 0.1);
        Assert.assertEquals(4, valMul, 0.1);
        Assert.assertEquals(1, valDiv, 0.1);
    }
}
