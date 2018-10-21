package com.tsekhanovich.patterns.generative.builder.example1;

import com.tsekhanovich.patterns.generative.builder.example1.builders.HawaiianPizzaBuilder;
import com.tsekhanovich.patterns.generative.builder.example1.builders.PizzaBuilder;
import com.tsekhanovich.patterns.generative.builder.example1.director.Waiter;
import com.tsekhanovich.patterns.generative.builder.example1.product.Pizza;

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
