import java.util.Scanner;
public class day21_rahmatia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);


        scanner.close();   
    }
 
}
