package com.tsekhanovich.patterns.behavioral.iterator.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Tsekhanovich 23.08.2018
 * <p>
 * Iterator
 * Makes it possible to consistently bypass all the elements of a composite object,
 * not disclosing his internal representation.
 * <p>
 * + Simplifies storage classes.
 * + Allows you to implement various ways to bypass the data structure.
 * + Allows you to simultaneously navigate the data structure in different directions.
 * <p>
 * - It is not justified if one can do with a simple cycle.
 */

public class Main {

    public static void main(String args[]) {
        List<String> animalList = new ArrayList<>();
        animalList.add("Horse");
        animalList.add("Lion");
        animalList.add("Tiger");
        Animal animal = new Animal(animalList);
        for (String animalObj : animal) {
            System.out.println(animalObj);
        }
    }
}