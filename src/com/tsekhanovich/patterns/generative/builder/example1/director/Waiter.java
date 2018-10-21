package com.tsekhanovich.patterns.generative.builder.example1.director;

import com.tsekhanovich.patterns.generative.builder.example1.builders.PizzaBuilder;
import com.tsekhanovich.patterns.generative.builder.example1.product.Pizza;

public class Waiter {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
