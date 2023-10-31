

package com.mycompany.day23_rahmatia;

import java.util.Scanner;


public class Day23_rahmatia {

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
      System.out.print("Masukkan jumlah barang: ");
      int jumlahBarang = input.nextInt();
      System.out.print("Masukkan harga satuan: ");
      int hargaSatuan = input.nextInt();
      int totalHarga = jumlahBarang * hargaSatuan;
      double ppn = 0.1 * totalHarga;
      double totalBayar = totalHarga + ppn;
      System.out.println("Jumlah barang: " + jumlahBarang);
      System.out.println("Harga satuan: " + hargaSatuan);
      System.out.println("Total harga: " + totalHarga);
      System.out.println("PPN 10%: " + ppn);
      System.out.println("Total bayar: " + totalBayar);
    }
}
