package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Mazda");//!!!!!

        System.out.println(cars);

        System.out.println(cars.size());

    }

}
