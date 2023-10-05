package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine<HotDrink> {
    private List<HotDrink> list = new ArrayList<>();


    public void initProduct(List<HotDrink> newlist) {
        this.list = newlist;
        System.out.println(newlist);
    }


    @Override
    public void GetProduct(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println(list.get(i));
            }
        }
    }
}


