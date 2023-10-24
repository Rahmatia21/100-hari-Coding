

package com.mycompany.day16_rahmatia;
import java.util.Scanner;
public class Day16_rahmatia {

    public static void main(String[] args) {
       int Nilai;
       Scanner masukkan=new
       Scanner(System.in);
       System.out.println("Nilai rahmatia:");
       Nilai=masukkan.nextInt();

       if(Nilai>=50){
         System.out.println("Anda lulus:");

        }else{ 
           System.out.println("Anda tidak lulus:");
        }
    }
}
