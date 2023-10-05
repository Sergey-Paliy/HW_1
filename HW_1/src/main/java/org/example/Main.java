package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       HotDrink tea = new HotDrink("tea", 0.2, 100);
        HotDrink mulledWine = new HotDrink("mulled wine",0.5,98);
        HotDrink cofee = new HotDrink("cofee",0.3,95);
        List<HotDrink> list = new ArrayList(List.of(cofee, tea, mulledWine));


        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();

        machine.initProduct(list);
        machine.GetProduct("mulled wine");
        machine.GetProduct("cofee");
        machine.GetProduct("tea");

    }
}