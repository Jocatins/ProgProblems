package com.sphinxcodes;

import java.util.Scanner;

public class TestCodes8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Num: ");
        int a = scan.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < a/2; i++){
            if(a % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print("It is a Prime number");
        }else{
            System.out.print("Not a Prime number");
        }

    }
}
