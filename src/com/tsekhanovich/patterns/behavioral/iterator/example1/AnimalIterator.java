package com.tsekhanovich.patterns.behavioral.iterator.example1;

import java.util.Iterator;
import java.util.List;

public class AnimalIterator<String> implements Iterator<Object> {

    private List<?> animal;
    private int position;

    public AnimalIterator(Animal animalBase) {
        this.animal = animalBase.getAnimal();
    }

    public boolean hasNext() {
        return position < animal.size();
    }

    public Object next() {
        Object aniObj = animal.get(position);
        position++;
        return aniObj;
    }

    public void remove() {
        animal.remove(position);
    }
}
