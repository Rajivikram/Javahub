package com.javahub.p04;

import java.util.Comparator;

/**
 * Created by RAJRA on 9/30/2016.
 */
public class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        if (p1.getAge() == p2.getAge()) {
            return p1.getPname().compareToIgnoreCase(p2.getPname());
        } else if (p1.getAge() > p2.getAge()) {
            return 1;
        }

        return -1;
    }
}
