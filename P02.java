package com.javahub.codingBat;

import java.util.Scanner;

/**
 * @author Raji on 22-03-2017.
 */
public class P02 {
 public static void main(String[] args) {
     System.out.println("Enter the table number:");
     Scanner scanner = new Scanner(System.in);
     int i = scanner.nextInt();
     System.out.println("Multiplication table of "+ i +" is");

     for (int n= 1 ; n <= 15 ; n++) {
         System.out.println(n + "*" + i + "=" + (i*n));
     }


 }
}
