package Jobsheet08;

import java.util.Scanner;

public class NilaiKelompok04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rataTertinggi = 0;
        int kelompokTertinggi = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("\nKelompok " + i);
            double totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                double nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            double rataNilai = totalNilai / 5;
            System.out.println("Rata-rata: " + rataNilai);
            
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
        }

        System.out.println("\nKelompok dengan rata-rata tertinggi adalah kelompok " + kelompokTertinggi);
        System.out.println("Rata-rata tertinggi: " + rataTertinggi);
    }
}
