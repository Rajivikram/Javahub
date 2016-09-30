package com.javahub.p04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by RAJRA on 9/30/2016.
 */
public class PersonData {
    public List<Person> getPersons() {
        ArrayList<Person> list = new ArrayList<Person>(5);
        list.add(new Person("raji", 23));
        list.add(new Person("vikram",55));
        list.add(new Person("Shanthi", 45));
        list.add(new Person("jansi", 23));
        return list;
    }
}
