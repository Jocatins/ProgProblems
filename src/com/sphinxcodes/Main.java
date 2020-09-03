package com.sphinxcodes;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number : ");
        int a = scan.nextInt();
        System.out.print("Second number : ");
        int b = scan.nextInt();
        int sum = 0 , mul = 1;

        if(a <  b){
            for(int i = a + 1; i < b ; i++){
                sum = sum + i;
                mul = mul * i;
            }
            System.out.print("Sum = " + sum + "  mul = " + mul);
        }

    }

}