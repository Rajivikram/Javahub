package com.javahub.p03;

import java.util.HashMap;

/**
 * Created by RAJRA on 9/27/2016.
 */
public class Problem03 {

public void numberSeriesByAlaphabets(String value) {
    int total = 0;
    char charValue;
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < value.length(); i++) {
        charValue = value.charAt(i);
//        System.out.println(charValue);
        int numberSeries = getNumberSeries(charValue);
        stringBuilder.append(numberSeries);
        total += numberSeries;
    }
    System.out.println("The number series is : " +stringBuilder);
    System.out.println("The total value of number series is :" +total);
}
    private int getNumberSeries(char charValue) {
//        System.out.println(charValue);
        return hashMap.get(String.valueOf(charValue)) ;
    }

   static HashMap<String, Integer> hashMap = new HashMap<String, Integer>(26);
    static {
        int indexValue = 1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            hashMap.put(String.valueOf(ch), indexValue);
            indexValue++;
        }
//        System.out.println(hashMap);
    }
}
