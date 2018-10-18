package com.tsekhanovich.patterns.structural.decorator.example2;

public interface DataSource {

    void writeData(String data);

    String readData();
}