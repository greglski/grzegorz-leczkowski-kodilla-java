package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PrimaveraDecorator extends AbstractPizzaOrderDecorator {
    public PrimaveraDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + upgrade to Primavera";
    }
}
