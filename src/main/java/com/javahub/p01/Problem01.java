package com.javahub.p01;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Rajii on 13-09-2016.
 */
public class Problem01 {

    public  void sort() {
        Fruit[] fruits = new Fruit[5];
        Fruit apple = new Fruit("Apple", 4);
        Fruit mango = new Fruit("Mango", 3);
        Fruit blueberry = new Fruit("Blueberry", 8);
        Fruit grapes = new Fruit("Grapes", 2);
        Fruit guava = new Fruit("Guava", 1);
        fruits[0] = apple;
        fruits[1] = mango;
        fruits[2] = blueberry;
        fruits[3] = grapes;
        fruits[4] = guava;
        Arrays.sort(fruits);

        for (Fruit f : fruits) {
            System.out.println( f.getFname() + " "+ f.getFsize());
        }

            }
        }



