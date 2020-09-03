package com.sphinxcodes;

import java.util.Scanner;

public class TestCodes3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = scan.nextInt();
        System.out.print("Col: ");
        int cols = scan.nextInt();
        //condition
        if(rows <=0 || cols <= 0){
            System.out.println("There is an error");
        }
        //formula
        for(int i = 1; i <= rows; i++ ){
            for(int j = 1; j <= cols; j++){
                System.out.print("T");
            }
            System.out.println();
        }
    }
}
