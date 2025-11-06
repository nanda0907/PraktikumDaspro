package Jobsheet08;

import java.util.Scanner;
public class NilaiKelompok04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        double rataTertinggi = 0;
        int kelompokTertinggi = 0;


        while (i <= 6) {
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
            i++;
        }
        System.out.println("Kelompok dengan rata-rata tertinggi adalah kelompok " + kelompokTertinggi);
        System.out.println("Rata-rata tertinggi: " + rataTertinggi);
    }
}
