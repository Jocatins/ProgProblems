package com.sphinxcodes;

import java.util.Scanner;

public class TestCodes9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int result = 1;
        int x = a/10;
        while(x != 0){
            x = x/10;
            result ++;
        }
        System.out.println(result);

    }
}
