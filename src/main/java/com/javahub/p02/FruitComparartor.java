package com.javahub.p02;

import java.util.Comparator;

/**
 * Created by RAJRA on 9/15/2016.
 */
public class FruitComparartor implements Comparator<Fruit> {

    public int compare(Fruit fruit1, Fruit fruit2) {
        int result = 0;
        if (fruit1.getFsize() < fruit2.getFsize())
            result = -1;
        else if (fruit1.getFsize() > fruit2.getFsize())
          result = 1;
        return result;
    }
}
