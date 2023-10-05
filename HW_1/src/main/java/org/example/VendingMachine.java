package org.example;


import java.util.List;

public interface VendingMachine<T extends Drink> {
    void initProduct(List<T> newlist);
    void GetProduct(String name);
}

