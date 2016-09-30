package com.javahub.p04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RAJRA on 9/30/2016.
 */
public class Person {
    private String pname;
    private int age;

    public Person(String pname, int age) {
        this.pname = pname;
        this.age = age;
    }

    public String getPname() {
        return pname;
    }



    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        {
            return this.getPname() + " " + this.getAge();
        }
    }
}
