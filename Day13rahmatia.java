
package com.mycompany.day13rahmatia;
import java.util.Scanner;

public class Day13rahmatia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris segitiga: ");
        int jumlahBaris = input.nextInt();

        for (int i = 1; i <= jumlahBaris; i++) {
            for (int j = 1; j <= jumlahBaris - i; j++) {
                System.out.print("  "); // Spasi
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("* "); // Bintang
            }
            System.out.println(); // Pindah baris
        }
    }

    }

