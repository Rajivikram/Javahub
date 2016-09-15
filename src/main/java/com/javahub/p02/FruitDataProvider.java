package com.javahub.p02;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by RAJRA on 9/15/2016.
 */
public class FruitDataProvider {

    private static final FruitDataProvider INSTANCE = new FruitDataProvider();
    private static final String PREFIX = "FRUIT";
    private FruitDataProvider() {}

    public static synchronized final FruitDataProvider getInstance() {
        return INSTANCE;
    }
    public List<Fruit> getFruits() {
        final ArrayList<Fruit> fruits = new ArrayList<Fruit>(12);
        fruits.add(new Fruit(PREFIX + 0 ,FruitType.APPLE , Color.RED , 5));
        fruits.add(new Fruit(PREFIX + 1 ,FruitType.MANGO , Color.YELLOW ,6));
        fruits.add(new Fruit(PREFIX + 2 ,FruitType.ORANGE , Color.ORANGE ,2));
        fruits.add(new Fruit(PREFIX + 3 ,FruitType.APPLE , Color.YELLOW , 5));
        fruits.add(new Fruit(PREFIX + 4 ,FruitType.ORANGE , Color.RED , 7));
        return fruits;
    }
}
