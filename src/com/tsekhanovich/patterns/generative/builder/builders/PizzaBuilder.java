package com.tsekhanovich.patterns.generative.builder.builders;

import com.tsekhanovich.patterns.generative.builder.product.Pizza;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();
}
