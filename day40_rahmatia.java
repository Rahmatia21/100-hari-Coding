
import java.util.Scanner;


public class day40_rahmatia {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang alas jajargenjang: ");
        double alas = scanner.nextDouble();

        System.out.println("Masukkan tinggi jajargenjang: ");
        double tinggi = scanner.nextDouble();

        // Hitung luas jajargenjang
        double luas = alas * tinggi;

        // Hitung keliling jajargenjang
        double keliling = 2 * (alas + tinggi);

        System.out.println("Luas jajargenjang: " + luas);
        System.out.println("Keliling jajargenjang: " + keliling);
    }
  
}
