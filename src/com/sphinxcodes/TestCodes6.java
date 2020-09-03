package com.sphinxcodes;

public class TestCodes6 {
    public static void main(String[] args) {
        int even = 0, odd = 1;
        for(int i = 1; i <= 20; i+=2){
            odd = odd * i;
        }
        for(int i = 0; i <= 100; i+=2 ){
            even = even + i;
        }
        System.out.print("Odd - " + odd + " even- " + even);
    }
}
