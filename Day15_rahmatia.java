
package com.mycompany.day15_rahmatia;


public class Day15_rahmatia {

    public static void main(String[] args) {
      // Deklarasi variabel
    int tinggi = 5;

    // Perulangan untuk membuat baris
    for (int i = tinggi; i >= 1; i--) {

      // Perulangan untuk membuat kolom
      for (int j = 1; j <= i; j++) {

        // Mencetak karakter bintang
        System.out.print("*");
      }

      // Mencetak baris baru
      System.out.println();
    }
  }
}
    