

package com.mycompany.day26_rahmatia;

public class Day26_rahmatia {

    public static void main(String[] args) {
        int nilai;
        nilai = 75;
        System.out.println("Nilai = "+nilai);
       
        if(nilai>=80)
            System.out.println("Predikat A");
        else if(nilai>=69)
            System.out.println("Predikat B");
        else if(nilai>=56)
            System.out.println("Predikat C");
        else if(nilai>=40)
            System.out.println("Predikat D");
        else
            System.out.println("Predikat E");
    }
}
