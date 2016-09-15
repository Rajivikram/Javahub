package com.javahub.p02;

/**
 * Created by RAJRA on 9/15/2016.
 */
public class Fruit {
    private String fid;
    private FruitType ftype;
    private Color fcolor;
    private int fsize;

    public Fruit(String fid, FruitType ftype) {
        this(fid , ftype , Color.RED ,5);
    }

    public Fruit(String fid, FruitType ftype, Color fcolor, int fsize) {
        this.fid = fid;
        this.ftype = ftype;
        this.fcolor = fcolor;
        this.fsize = fsize;
    }

    public String getFid() {
        return fid;
    }

    public Color getFcolor() {
        return fcolor;
    }

    public void setFcolor(Color fcolor) {
        this.fcolor = fcolor;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public FruitType getFtype() {
        return ftype;
    }

    public void setFtype(FruitType ftype) {
        this.ftype = ftype;
    }

    public int getFsize() {
        return fsize;
    }

    public void setFsize(int fsize) {
        this.fsize = fsize;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("{");
        builder.append("id: " + fid + ", ");
        builder.append("type: " + ftype + ", ");
        builder.append("color: " + fcolor + ", ");
        builder.append("size: " + fsize);
        builder.append("}");

        return builder.toString();

    }
}
