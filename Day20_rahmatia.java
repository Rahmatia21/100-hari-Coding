

package com.mycompany.day20_rahmatia;

import java.util.Scanner;


public class Day20_rahmatia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan bilangan biner: ");
        String biner = input.nextLine();

        
        int desimal = 0;
        for (int i = biner.length() - 1; i >= 0; i--) {
            if (biner.charAt(i) == '1') {
                desimal += Math.pow(2, biner.length() - i - 1);
            }
        }

        
        System.out.println("Nilai desimal: " + desimal);
    }
}
