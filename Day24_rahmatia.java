
package com.mycompany.day24_rahmatia;

import java.util.Scanner;

public class Day24_rahmatia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        String[] nimMahasiswa = new String[jumlahMahasiswa];
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            namaMahasiswa[i] = input.next();
            
            System.out.print("Masukkan NIM mahasiswa ke-" + (i+1) + ": ");
            nimMahasiswa[i] = input.next();
            
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }
        
        System.out.println("\n=== Data Mahasiswa ===");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nama: " + namaMahasiswa[i]);
            System.out.println("NIM: " + nimMahasiswa[i]);
            System.out.println("Nilai: " + nilaiMahasiswa[i]);
           
        }
    }
}
