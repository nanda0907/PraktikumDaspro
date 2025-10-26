package Praktikum06;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaSewa, biayaSupir, bahanBakar, lamaSewa, jarakTempuh;
        double totalBiaya;

        System.out.print("\nMasukkan lama sewa: ");
        lamaSewa = sc.nextInt();
        System.out.print("Masukkan jarak tempuh: ");
        jarakTempuh = sc.nextInt();
        System.out.print("Masukkan biaya supir: ");
        biayaSupir = sc.nextInt();

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        bahanBakar = 1000 * jarakTempuh;
        totalBiaya = biayaSewa + biayaSupir + bahanBakar;

        if (totalBiaya > 2000000) {
            totalBiaya = totalBiaya - (totalBiaya * 0.05);
            System.out.println("Anda mendapatkan diskon 5%");
        }

        System.out.println("totalBiaya: Rp " + totalBiaya);
        System.out.println("Jarak Tempuh (km):  " + jarakTempuh);
    }
}
