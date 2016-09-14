package com.javahub.p01;

import java.util.Comparator;

/**
 * Created by Rajii on 13-09-2016.
 */

public class Fruit implements Comparator<Fruit> ,Comparable<Fruit> {

    private String fname;
    private int fsize;

    Fruit() {

    }

    public Fruit(String fname, int fsize) {
        this.fname = fname;
        this.fsize = fsize ;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getFsize() {
        return fsize;
    }

    public void setFsize(int fsize) {
        this.fsize = fsize;
    }

    public int compareTo(Fruit fruit) {
//        return (this.fname).compareTo(fruit.fname);
        int compareSize = ((Fruit) fruit).getFsize();
        return this.fsize - compareSize;
    }
    public int compare(Fruit fruit, Fruit fruit1) {
        return fruit.fsize - fruit1.fsize;
    }

    @Override
    public String toString() {
        return this.getFname() + " " + this.getFsize();
    }
}