package com.sphinxcodes;


import java.util.Scanner;

public class TestCodes5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Exponent: ");
        int exp = sc.nextInt();
        int result = 1, i =1;

        do{
            result = result * base;
            i++;

        } while (i <= exp);
        System.out.println(result);
    }
}

