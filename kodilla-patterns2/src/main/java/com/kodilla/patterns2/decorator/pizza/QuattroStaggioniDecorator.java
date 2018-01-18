package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class QuattroStaggioniDecorator extends AbstractPizzaOrderDecorator {
    public QuattroStaggioniDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(15));
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + upgrade to Quattro Staggioni";
    }
}
