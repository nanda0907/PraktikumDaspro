package Praktikum06;

import java.util.Scanner;
public class latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaSewa, biayaSupir, bahanBakar, lamaSewa, jarakTempuh, totalBiaya;

        System.out.print("\nMasukkan lama sewa: ");
        lamaSewa = sc.nextInt();

        if (lamaSewa > 30) {
            System.out.println("Lama sewa maximal 30 hari");
        } else {
            System.out.print("Masukkan jarak tempuh: ");
            jarakTempuh = sc.nextInt();
            System.out.print("Masukkan biaya supir: ");
            biayaSupir = sc.nextInt();

        
            biayaSewa = 300000 * lamaSewa;
            biayaSupir = 200000 * lamaSewa;
            bahanBakar = 1000 * jarakTempuh;
            totalBiaya = biayaSewa + biayaSupir + bahanBakar;

            System.out.println("totalBiaya: Rp " + totalBiaya);
            System.out.println("Jarak Tempuh (km):  " + jarakTempuh);
        }
    }
}
