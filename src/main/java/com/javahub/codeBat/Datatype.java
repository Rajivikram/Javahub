package com.javahub.codeBat;

import java.util.Scanner;

/**
 * @author Raji on 23-03-2017.
 */
public class Datatype {
    public static void main(String[] args) {
        int i = 5;
        int i1, sum;
        double d = 7.5;
        double d1;
        String s = "HackerRank";
        String s1,text;
        Scanner scanner = new Scanner(System.in);
        i1 = scanner.nextInt();
        sum = i + i1;
        System.out.println(sum);
        d1 = scanner.nextDouble();
        double value = d + d1;
        System.out.println(value);
        s1 = scanner.next();
        text = s + s1;
        System.out.println(text);
        scanner.close();
    }
}
