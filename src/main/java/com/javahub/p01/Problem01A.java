package com.javahub.p01;

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
     Collections.sort(list , new Fruit());
     for (Fruit fruit : list) {
         System.out.println(fruit.getFname() + " :" +fruit.getFsize());
     }

 }
}

