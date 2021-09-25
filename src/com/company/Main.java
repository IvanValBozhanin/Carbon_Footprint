package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        test();
    }
    public static void test(){
        ArrayList<CarbonFootprint> list = new ArrayList<>();
        list.add(new Bicycle("a", "b"));
        list.add(new Car(Engine.CNG, 100));
        list.add(new Bicycle("a", "b"));
        list.add(new Building(10, 10, 20, 30));
        list.add(new Bicycle("a", "b"));
        list.add(new Car(Engine.Diesel, 500));
        list.add(new Building(4, 50, 20, 10));
        for (CarbonFootprint element :
                list) {
            System.out.println(element.getCarbonFootprint()+ "\t\t\t" + element.toString());
        }
    }
}
