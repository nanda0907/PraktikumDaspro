package Jobsheet10;
import java.util.Scanner;

public class Tugas04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[10][6];
        int responden, pertanyaan, nilai;
        int input;

        // FLOWCHART A : Input Data Survey
        while (true) {
            System.out.println("\n--- INPUT DATA SURVEY ---");
            System.out.print("Masukkan nomor responden (0-9): ");
            responden = sc.nextInt();

            System.out.print("Masukkan nomor pertanyaan (0-5): ");
            pertanyaan = sc.nextInt();

            System.out.print("Masukkan nilai (1-5): ");
            nilai = sc.nextInt();

            survey[responden][pertanyaan] = nilai;

            System.out.print("Input data lagi? (1=YA, 0=TIDAK): ");
            input = sc.nextInt();

            if (input == 0)
                break; // keluar dari loop
        }
        // FLOWCHART B : Rata-rata Responden
        while (true) {
            System.out.println("\n--- RATA-RATA PER RESPONDEN ---");
            System.out.print("Masukkan nomor responden (0-9): ");
            responden = sc.nextInt();

            double total = 0;
            for (int i = 0; i < 6; i++) {
                total += survey[responden][i];
            }

            double rata = total / 6;
            System.out.println("Rata-rata responden " + responden + " = " + rata);

            System.out.print("Hitung lagi? (1=YA, 0=TIDAK): ");
            input = sc.nextInt();

            if (input == 0)
                break;
        }
        // FLOWCHART C : Rata-rata Pertanyaan
        while (true) {
            System.out.println("\n--- RATA-RATA PER PERTANYAAN ---");
            System.out.print("Masukkan nomor pertanyaan (0-5): ");
            pertanyaan = sc.nextInt();

            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][pertanyaan];
            }

            double rata = total / 10;
            System.out.println("Rata-rata pertanyaan " + pertanyaan + " = " + rata);

            System.out.print("Hitung lagi? (1=YA, 0=TIDAK): ");
            input = sc.nextInt();

            if (input == 0)
                break;
        }
        // FLOWCHART D : Rata-rata Keseluruhan
       
        System.out.println("\n--- RATA-RATA KESELURUHAN ---");

        double total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
        }
        double rataSemua = total / 60;
        System.out.println("Rata-rata seluruh data = " + rataSemua);
        System.out.println("\nProgram selesai.");
    }
}
