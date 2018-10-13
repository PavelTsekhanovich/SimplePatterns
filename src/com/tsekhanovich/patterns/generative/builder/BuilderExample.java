package com.tsekhanovich.patterns.generative.builder;

import com.tsekhanovich.patterns.generative.builder.builders.HawaiianPizzaBuilder;
import com.tsekhanovich.patterns.generative.builder.builders.PizzaBuilder;
import com.tsekhanovich.patterns.generative.builder.director.Waiter;
import com.tsekhanovich.patterns.generative.builder.product.Pizza;

public class BuilderExample {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder pizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}
