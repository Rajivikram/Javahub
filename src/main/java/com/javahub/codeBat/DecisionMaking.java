package com.javahub.codeBat;

import java.util.Scanner;

/**
 * @author Raji on 28-03-2017.
 */
public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans = "";
        if(n%2 == 1 ) {
            ans = "Weird";
        }else if (n%2 == 0 && (n>=2 && n<=5)){
            ans = "Not Weird";
        }else if(n%2 == 0 && (n>=6 && n<=20)) {
            ans = "Weird";
        }else if(n%2 == 0 && (n>=20)) {
            ans = "Not Weird";
        }
        System.out.println(ans);
    }

}
