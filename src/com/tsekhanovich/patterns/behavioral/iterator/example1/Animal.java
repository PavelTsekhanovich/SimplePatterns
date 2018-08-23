package com.tsekhanovich.patterns.behavioral.iterator.example1;

import java.util.Iterator;
import java.util.List;

public class Animal implements Iterable<String> {

    private List<String> animal;

    public Animal(List animal) {
        this.animal = animal;
    }

    public List<String> getAnimal() {
        return animal;
    }

    public Iterator<String> iterator() {
        return new AnimalIterator(this);
    }
}