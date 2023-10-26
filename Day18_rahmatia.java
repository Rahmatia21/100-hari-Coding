

package com.mycompany.day18_rahmatia;

import java.util.Scanner;

public class Day18_rahmatia {

    public static void main(String[] args) {
        	int a;
    Scanner input = new Scanner(System.in);
     
    System.out.print("Input nilai ujian: ");
    a = input.nextInt();
 
    if (a >= 75) {
      System.out.println("Selamat,ANDA LULUS");
    }
    else {
      System.out.println("Maaf, silahkan cobah lagi");
    }
    }
}
