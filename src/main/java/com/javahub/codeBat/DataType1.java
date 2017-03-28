package com.javahub.codeBat;

import java.util.Scanner;

/**
 * @author Raji on 28-03-2017.
 */
public class DataType1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.next();

        System.out.println("String :" + s);
        System.out.println("Double:" + d);
        System.out.println("Int:" + i);
    }
}
