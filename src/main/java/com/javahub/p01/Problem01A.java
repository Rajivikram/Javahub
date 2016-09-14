package com.javahub.p01;

import com.sun.glass.ui.Size;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Rajii on 14-09-2016.
 */
public class Problem01A {
    public void sort() {
        List<Fruit> list = new ArrayList<Fruit>();
        list.add(new Fruit("Apple" , 3));
        list.add(new Fruit("Mango" , 5));
        list.add(new Fruit("Blueberry" , 7));
        list.add(new Fruit("Guava" , 4));
        list.add(new Fruit("Grapes" , 1));
        Collections.sort(list);
        System.out.println(list);
        Fruit minFruit = list.get(0);
        System.out.println("minimum count of the fruit" +minFruit);
        Fruit maxFruit = list.get(list.size() - 1);
        System.out.println("maximum size of the fruit" + maxFruit);
    }
}