import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("=== HITUNG LUAS SEGITIGA===");
            System.out.println("Mau menampilkan Luas dalam bentuk? \n " +
                    "1. untuk Hasil Integer \n " +
                    "2. untuk Hasil double \n " + "Masukkan pilihan 1 / 2 ");
        try {
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Alas dan Tinggi: ");
                    int alas = sc.nextInt();
                    int tinggi = sc.nextInt();

                    Segitiga<Integer> segitigaint = new Segitiga<>(alas, tinggi);
                    System.out.println("\n Luas Segitiga Dalam Integer: " + segitigaint.getResultAsInt());
                    break;
                case 2:
                    System.out.println("Masukkan Alas dan Tinggi: ");
                    double alasDouble = sc.nextDouble();
                    double tinggiDouble = sc.nextDouble();

                    Segitiga<Double> segitigadouble = new Segitiga<>(alasDouble, tinggiDouble);
                    System.out.println("\n Luas Segitiga Dalam Double: " + segitigadouble.getResultAsDouble());
                    break;
                default:
                    System.out.println("Masukkan pilihan yang benar (1 atau 2):");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid, silakan masukkan angka");
            sc.nextLine(); // consume the invalid input to prevent infinite loop
            choice = 0; // reset choice to force the loop to repeat
        }
    } while (choice != 1 && choice != 2);
    }
}
