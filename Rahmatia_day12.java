
package rahmatia_day12;
import java.util.Scanner;
public class Rahmatia_day12 {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan persegi panjang:");
        double panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar persegi panjang;");
        double lebar = scanner.nextDouble();
        double area = panjang*lebar;
        System.out.println("Luas persegi panjang adalah:"+area);
       
    }
    
}
