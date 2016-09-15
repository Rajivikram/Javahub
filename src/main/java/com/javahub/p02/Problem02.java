package com.javahub.p02;

import java.util.*;

/**
 * Created by RAJRA on 9/15/2016.
 */
public class Problem02 {
    public void groupFruitsByColor() {
        final List<Fruit> fruits = FruitDataProvider.getInstance().getFruits();
        System.out.println("The list of the Fruits : " + fruits);

        Map<Color, List<Fruit>> colorMap = new HashMap<Color, List<Fruit>>(5);
        for (Fruit fruit : fruits) {
        groupFruit(colorMap , fruit);
        }

        System.out.println("GroupMapped" + colorMap);

        List<Fruit> coloredFruits;
        final Set<Map.Entry<Color, List<Fruit>>> entries = colorMap.entrySet();
        for (Map.Entry<Color, List<Fruit>> entry : entries) {
            coloredFruits = entry.getValue();
            System.out.println("Number of fruits in " + entry.getKey() + " is " + coloredFruits.size());

            Collections.sort(coloredFruits, new FruitComparartor());
            System.out.println("For " + entry.getKey() + " Min size is " + coloredFruits.get(0));
            System.out.println("For " + entry.getKey() + " Max size is " + coloredFruits.get(coloredFruits.size() - 1));


        }
    }

    private void groupFruit(Map<Color, List<Fruit>> colorMap, Fruit fruit) {
        List<Fruit> fruits = colorMap.get(fruit.getFcolor());
        if (fruits == null) {
            fruits = new ArrayList<Fruit>(2);
            colorMap.put(fruit.getFcolor(), fruits);
        }

        fruits.add(fruit);
    }
}