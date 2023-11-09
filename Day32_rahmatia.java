
package day32_rahmatia;

import java.util.Scanner;


public class Day32_rahmatia {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Masukan jari-jari lingkaran: ");
       int r = scanner.nextInt();
 
       double phi  = 3.14;
       double L = phi * (r * r);
 
       System.out.println(L);
        
    }
    
}
