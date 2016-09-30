package com.javahub.p04;

import java.util.Collections;
import java.util.List;

/**
 * Created by RAJRA on 9/30/2016.
 */
public class Problem04 {
    public void sortByAgeAndName() {
        List<Person> persons = new PersonData().getPersons();
        Collections.sort(persons, new PersonComparator());
        System.out.println(persons);
    }
}
