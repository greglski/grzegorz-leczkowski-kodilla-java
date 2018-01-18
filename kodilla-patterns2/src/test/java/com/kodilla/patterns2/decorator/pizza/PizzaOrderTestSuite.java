package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderGetIngredient() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String pizzaComposition = pizzaOrder.getIngredient();
        //Then
        assertEquals("Margherita", pizzaComposition);
    }

    @Test
    public void testUpgradeToPrimaveraWithTunaExtraCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PrimaveraDecorator(pizzaOrder);
        pizzaOrder = new TunaDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(33), cost);
    }

    @Test
    public void testUpgradeToPrimaveraWithTunaExtraCheeseGetIngredient() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PrimaveraDecorator(pizzaOrder);
        pizzaOrder = new TunaDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        String pizzaComposition = pizzaOrder.getIngredient();
        //Then
        assertEquals("Margherita + upgrade to Primavera + Tuna + extra cheese", pizzaComposition);
    }
}
