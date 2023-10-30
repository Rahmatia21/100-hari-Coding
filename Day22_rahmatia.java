
package com.mycompany.day22_rahmatia;

import java.util.Scanner;

public class Day22_rahmatia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.print("Masukkan jumlah barang: ");
      int jumlahBarang = input.nextInt();
      System.out.print("Masukkan harga satuan: ");
      int hargaSatuan = input.nextInt();
      int totalHarga = jumlahBarang * hargaSatuan;
      System.out.println("Jumlah barang: " + jumlahBarang);
      System.out.println("Harga satuan: " + hargaSatuan);
      System.out.println("Total harga: " + totalHarga);
        
        
    }
}
